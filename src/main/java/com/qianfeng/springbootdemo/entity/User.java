package com.qianfeng.springbootdemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @authorcom.qianfeng.springbootdemo.entity
 * @Date2019/7/30
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

    @JsonInclude(JsonInclude.Include.NON_NULL) //（为空）空字段不返回
    private String name;

    @JsonIgnore     //指定字段不返回(该字段不会返回页面)
    private String password;



    //修改时间格式，后期如果所有类都需要格式转换则需要在配置文件中设置
   /* @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")*/
    private Date entryDate;

    public User(String name, String password, Date entryDate) {
        this.name = name;
        this.password = password;
        this.entryDate = entryDate;
    }

    public User() {
    }
}
