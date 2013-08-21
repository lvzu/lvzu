package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: lianghongbin
 * Date: 13-8-21
 * Time: 下午10:46
 * Description: 规划涉及地址
 */
public class PlanAnswer extends Id {

    private Plan plan;
    private User user;
    private boolean selected;
    private boolean used;
    private Date createTime;

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
