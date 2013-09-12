package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午3:43
 * Description:
 */
public class User extends Id {

    private String username;
    private String nickname;
    private String password;
    private String gender;
    private Date registerTime;
    private Date updateTime;
    private int validStatus;/* 0:停用 1:正常 */

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(int validStatus) {
        this.validStatus = validStatus;
    }
}
