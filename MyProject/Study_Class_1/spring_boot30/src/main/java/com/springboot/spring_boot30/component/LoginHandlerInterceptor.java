package com.springboot.spring_boot30.component;

import org.omg.PortableInterceptor.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * 拦截器，默认拦截登录请求
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user==null){
            //未登录,设置提示消息
            request.setAttribute("msg","no permission,please sign in first");
            //跳转
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            //已登录
            return true;
        }
    }
}
