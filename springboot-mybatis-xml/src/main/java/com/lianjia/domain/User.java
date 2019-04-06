package com.lianjia.domain;

import com.lianjia.enums.SexEnums;

/**
 * @author panli
 * User的实体类
 * @date 2019.01.23
 */
public class User {

    private Long id;
    private String userName;
    private String passWord;
    private SexEnums userSex;
    private String nickName;

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

    public SexEnums getUserSex() {
        return userSex;
    }

    public void setUserSex(SexEnums userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userSex=" + userSex +
                ", nickName='" + nickName + '\'' +
                '}';
    }
    public User() {
    }
    public User(String userName, String passWord, SexEnums userSex) {
        super();
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
    }
}
