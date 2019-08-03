package com.qianfeng.springbootdemo.controller;

import com.qianfeng.springbootdemo.entity.Resource;
import com.qianfeng.springbootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @authorcom.qianfeng.springbootdemo.Controller
 * @Date2019/7/30
 */
@RestController   //等于Controller+下面方法中的@ResponseBody注解
@RequestMapping("user")
public class userController {

    @Autowired
    private Resource resource;


    public void test(){}



 /*   @Value("${fileServer.path}")
    public String fileServer;

    @Value("${emai1Server.path}")
    public  String emailServer;*/



    @GetMapping("properties")
    public String properties(){
        return resource.getEmailServer()+","+resource.getImageServer();
    }



    @RequestMapping("hello")
    public String hello(){
        return "hello,springboot!!!!!!你好啊";
    }

    //getmapping 等同于 @RequestMapping(name="page",method="RequsetMethod.Get")
    @GetMapping("page")
    public String page(@RequestParam(name="pageindex",required = false,defaultValue = "1") Integer pageindex){
            return "pageindex:"+ pageindex;
    }

    //result风格
    @GetMapping("page/{pageindex}")
    public String page2(@PathVariable("pageindex") Integer pageindex){
            return "pageidnex2:"+pageindex;

    }

    @PostMapping("add")
    public User add(User user){
        /*user.setEntryDate(new Date());*/
        return user;

    }


}
