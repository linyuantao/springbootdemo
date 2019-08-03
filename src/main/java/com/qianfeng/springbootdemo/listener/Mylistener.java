package com.qianfeng.springbootdemo.listener;


import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @authorcom.qianfeng.springbootdemo.listener
 * @Date2019/7/31
 */
@Component
    public class Mylistener implements ServletRequestListener {


    //请求结束后监听器销毁的方法
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("Mylistener requestDestroyed");

    }


    //请求进来的时候进行监听
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.err.println("Mylistener requestInitialized");

    }
}
