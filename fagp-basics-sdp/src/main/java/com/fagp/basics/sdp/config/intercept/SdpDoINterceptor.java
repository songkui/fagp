//package com.fagp.basics.sdp.config.intercept;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
///**
// * Http拦截器 暂时没有用
// * @Auther: SK
// * @Date: 2019/8/3 22:20
// * @Description:
// */
//@Configuration
//public class SdpDoINterceptor extends WebMvcConfigurationSupport {
//
//    @Autowired
//    private SdpInterceptor sdpInterceptor;
//    //需要拦截的路径
//    String[] addPathPatterns = {
//            "/**"
//    };
//    //不拦截的路径
//    String[] excludePathPatterns = {
//            "/hello",
//            "/login"
//    };
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(sdpInterceptor)
//                .addPathPatterns(addPathPatterns)
//                .excludePathPatterns(excludePathPatterns);
//    }
//
//}
