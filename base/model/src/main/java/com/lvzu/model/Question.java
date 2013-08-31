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


    private long    userid;     //提问者ID
    private long    journeyid;  //行程ID:因为一个问题提出的时候，
                                //也可能没有写行程。所以允许为NULL
    private String  title;      //问题标题
    private String  description;//简单描述
    private int     status;     //问题状态:0:问题中 1:问题结束
    private Date    createtime; //创建时间
    private Date    finishtime; //问题完成时间

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public long getJourneyid() {
        return journeyid;
    }

    public void setJourneyid(long journeyid) {
        this.journeyid = journeyid;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }
}

