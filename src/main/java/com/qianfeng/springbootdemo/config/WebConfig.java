package com.qianfeng.springbootdemo.config;

import com.qianfeng.springbootdemo.filter.MyFilter;
import com.qianfeng.springbootdemo.listener.Mylistener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**配置类
 * @authorcom.qianfeng.springbootdemo.config
 * @Date2019/7/31
 */
@Configuration
public class WebConfig {

    //自动注入的过滤器和监听器都是由spring直接管理
    @Autowired
    private MyFilter myFilter;

    @Autowired
    private Mylistener mylistener;

    //过滤器
    @Bean
    public FilterRegistrationBean initFilterRegisterBean(){
        FilterRegistrationBean filterRegistrationBean =new FilterRegistrationBean();
        //如果是new出来filter则就不是spring管理的
        filterRegistrationBean.setFilter(myFilter);
        //过滤器名称
        filterRegistrationBean.setName("myFilter");
        //拦截url
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }

    //监听器
    @Bean
    public ServletListenerRegistrationBean initListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean =
                new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(mylistener);
        return servletListenerRegistrationBean;

    }



}
