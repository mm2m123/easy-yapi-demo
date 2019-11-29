package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description 用户 Model
 * @Date 2019-10-27 10:55
 **/

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录名称
     * @Description
     * @date
     */
    private String username;

    /**
     * 密码
     * @Description
     * @date
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public User() {
    }

}
