package com.qianfeng.springbootdemo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**过滤器
 * @authorcom.qianfeng.springbootdemo.filter
 * @Date2019/7/31
 */

@Component  //交给spring管理
public class MyFilter implements Filter {

    //init初始
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("Myfilter init>>>>>>>>>");
    }

    //过滤请求响应放行
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.err.println("Myfilter doFilter>>>>>>>>>");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    //过滤器销毁
    @Override
    public void destroy() {
        System.err.println("Myfilter destroy>>>>>>>>>>");
    }
}
