package com.qfedu.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
@Api("成功吧")
public class tuser {
    private Integer uid;
    @ApiParam(name = "username",value = "帐号")
    private String username;
    @ApiParam(name = "password",value = "密码")
    private String password;
    @ApiParam(name = "phonenumber",value = "手机号")
    private String phonenumber;

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


}