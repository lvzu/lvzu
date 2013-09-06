package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午10:57
 * Description:提问者的问题内容。会创建游记计划或者只单纯问问题。
 */

public class Question extends Id {


    private long    userId;     //提问者ID
    private long    journeyId;  //行程ID:因为一个问题提出的时候，
                                //也可能没有写行程。所以允许为NULL
    private String  title;      //问题标题
    private String  description;//简单描述
    private int     status;     //问题状态:0:问题中 1:问题结束
    private Date    createTime; //创建时间
    private Date    finishTime; //问题完成时间

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(long journeyId) {
        this.journeyId = journeyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}

