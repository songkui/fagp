//package com.fagp.basics.sdp.config.intercept;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * http 拦截器
// * @Auther: SK
// * @Date: 2019/8/3 22:16
// * @Description:
// */
//@Configuration
//public class SdpInterceptor implements HandlerInterceptor {
//    /**
//     *  在请求处理之前进行调用（Controller方法调用之前）
//     */
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        // 进行逻辑判断，如果ok就返回true，不行就返回false，返回false就不会处理改请求
//
////        String name = request.getParameter("name");
//        System.err.println("进入方法前拦截器");
//        return true;
//    }
//
//    /**
//     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
//     */
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,  ModelAndView modelAndView) throws Exception {
//        //
//    }
//    /**
//     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
//     */
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {
//    }
//
//}
