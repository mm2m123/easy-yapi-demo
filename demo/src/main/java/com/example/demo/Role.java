package com.example.demo;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Description TODO:
 * @date 2019/11/29 13:50
 **/

public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     * @Description
     * @date
     */
    private String roleName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
