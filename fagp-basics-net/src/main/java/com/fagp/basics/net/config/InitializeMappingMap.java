package com.fagp.basics.net.config;

import com.fagp.basics.core.annotation.GameHandlerMapping;
import com.fagp.basics.core.annotation.Handler;
import com.fagp.basics.core.annotation.SdpHandlerMapping;
import com.fagp.basics.core.config.HandlerMappingInfo;
import com.fagp.basics.core.config.SdpHandlerMappingInfo;
import com.fagp.basics.core.enm.HandlerType;
import com.fagp.basics.core.enm.SdpHandlerType;
import com.fagp.basics.core.handler.FagpHandler;
import com.google.protobuf.GeneratedMessageV3;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: 保存 请求 和 handler 映射 信息
 * @Author King.Song
 * @Date 2019/8/8 0008
 **/
@Component
public class InitializeMappingMap {

    //游戏服务器映射对应的方法
    private final static ConcurrentHashMap<Integer, HandlerMappingInfo> typToMappint = new ConcurrentHashMap<>();

    //数据处理中心 映射对应的方法
    private final static ConcurrentHashMap<Integer, SdpHandlerMappingInfo> sdpTypToMappint = new ConcurrentHashMap<>();

    //
    public static HandlerMappingInfo getMapping(Integer handlerType) throws Exception {
        if (typToMappint.isEmpty()){
            initializeMapping();
        }
        return typToMappint.get(handlerType);
    }

    //
    public static SdpHandlerMappingInfo getSdpMapping(Integer handlerType) throws Exception {
        if (typToMappint.isEmpty()){
            initializeMapping();
        }
        return sdpTypToMappint.get(handlerType);
    }

    //初始化 handler
    public static void initializeMapping()throws Exception{
        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(false);
        provider.addIncludeFilter(new AnnotationTypeFilter(Handler.class));
        Set<BeanDefinition> components = provider.findCandidateComponents("com/fagp");
         for (BeanDefinition component : components) {
                Class clazz =  Class.forName(component.getBeanClassName());
                Method[] methods = clazz.getDeclaredMethods();
                for(Method m : methods){
                    if(m.isAnnotationPresent(GameHandlerMapping.class)){
                        GameHandlerMapping annotation =  m.getAnnotation(GameHandlerMapping.class);
                        HandlerType type = annotation.value();
                        buildMapping(type, m, clazz);
                    }else if (m.isAnnotationPresent(SdpHandlerMapping.class)){
                        SdpHandlerMapping sdpHandlerMapping = m.getAnnotation(SdpHandlerMapping.class);
                        SdpHandlerType type = sdpHandlerMapping.value();
                        buildSdpMapping(type, m, clazz);
                    }
                }
         }

    }

    private static void buildMapping(HandlerType type, Method method, Class<FagpHandler> clazz)throws  Exception{
        if (null == type || type.code() == 0){
            throw new Exception("初始化handlerMapping，handleType异常");
        }
        HandlerMappingInfo handlerMappingInfo = new HandlerMappingInfo();
        handlerMappingInfo.setHandlerType(type);
        handlerMappingInfo.setMethod(method);
        handlerMappingInfo.setHandler(Optional.ofNullable(SpringContextUtil.getBean(clazz)).orElseThrow(()-> new Exception("初始化handlerMapping,未找到对应Bean")));
        Method msgMethod = type.getMsgClass().getDeclaredMethod("getDefaultInstance", new Class[]{});
        handlerMappingInfo.setMessage(Optional.ofNullable((GeneratedMessageV3)msgMethod.invoke(type.getMsgClass(), new Object[]{})).orElseThrow(()-> new Exception("初始化handlerMapping,未找到对应Bean")) );
        typToMappint.put(type.code(), handlerMappingInfo);
    }

    /**
     * 数据处理中心 对应映射
     * @param type
     * @param method
     * @param clazz
     * @throws Exception
     */
    private static void buildSdpMapping(SdpHandlerType type, Method method, Class<FagpHandler> clazz)throws  Exception{
        if (null == type || type.code() == 0){
            throw new Exception("初始化handlerMapping，handleType异常");
        }
        SdpHandlerMappingInfo handlerMappingInfo = new SdpHandlerMappingInfo();
        handlerMappingInfo.setHandlerType(type);
        handlerMappingInfo.setMethod(method);
        handlerMappingInfo.setHandler(Optional.ofNullable(SpringContextUtil.getBean(clazz)).orElseThrow(()-> new Exception("初始化handlerMapping,未找到对应Bean")));
        sdpTypToMappint.put(type.code(), handlerMappingInfo);
    }



}
