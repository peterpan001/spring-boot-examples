package com.lianjia.domain;

import com.lianjia.enums.EnumSexs;

import java.io.Serializable;

/**
 * User实体类
 * @author panli
 * @date 2019.01.23
 */
public class User implements Serializable {

    private Long id;
    private String userName;
    private String passWord;
    private EnumSexs userSex;
    private String nickName;

    public User() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public EnumSexs getUserSex() {
        return userSex;
    }
    public void setUserSex(EnumSexs userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
