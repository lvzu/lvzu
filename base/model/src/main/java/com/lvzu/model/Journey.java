package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:09
 * Description:
 */
public class Journey extends Id {
    private Long userid;
    private String title;
    private Integer status;
    private Long days;
    private Long cost;
    private Long destinationid;
    private Date createtime;
    private Date finishtime;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(Long destinationid) {
        this.destinationid = destinationid;
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
