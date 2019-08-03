package com.qianfeng.springbootdemo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**拦截器
 * @authorcom.qianfeng.springbootdemo.interceptor
 * @Date2019/7/31
 */
@Component
public class AuthInterceptor implements HandlerInterceptor {

    //前置拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("preHandle  AuthInterceptor>>>>>>>>>>");

        //true为放行
        return true;
    }
}