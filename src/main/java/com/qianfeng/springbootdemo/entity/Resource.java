package com.qianfeng.springbootdemo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @authorcom.qianfeng.springbootdemo.entity
 * @Date2019/7/30
 */
@Component    //交给spring管理 ，调用配置文件
@ConfigurationProperties(prefix = "resource")
public class Resource {

    /*@Value("${resource.imageServer}"*/
    private String imageServer;

    /*@Value("${resource.emailServer}")*/
    private String emailServer;


    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
