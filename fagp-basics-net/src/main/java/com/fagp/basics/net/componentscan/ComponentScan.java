package com.fagp.basics.net.componentscan;

import com.fagp.basics.net.annotation.RequestHandler;
import com.fagp.basics.net.proto.RHMS;
import com.fagp.basics.net.util.MapUtil;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

import java.lang.reflect.Method;
import java.util.Set;

public class ComponentScan {
	
	public void scan(String basePackage) throws Exception{
		ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
		//provider.addIncludeFilter(new AnnotationTypeFilter(RequestHandler.class));
		//String basePackage = "com/kunda/netty/protocol";
		Set<BeanDefinition> components = provider.findCandidateComponents(basePackage);
		
		for (BeanDefinition component : components) {
			String clazzName = component.getBeanClassName();
		    Class<?> clazz =  Class.forName(clazzName);
		    Method[] methods = clazz.getDeclaredMethods();
		    for(Method m:methods){
		    	if(m.isAnnotationPresent(RequestHandler.class)){
		    		RequestHandler annotation =  m.getAnnotation(RequestHandler.class);
			    	RHMS.MsgType type = annotation.value();
			    	MapUtil.methodMap.put(type, m);
			    	MapUtil.handlerMap.put(type, clazz.newInstance());
		    	}
		    }
		}
		
		System.out.println(MapUtil.methodMap);
		System.out.println(MapUtil.handlerMap);
	}
	
	public static void main(String[] args) throws Exception{
		new ComponentScan().scan("com/slots/sdp/netty");
	}
}
