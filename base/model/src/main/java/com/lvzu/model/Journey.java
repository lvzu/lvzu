package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:09
 * Description:游记，其中会包括足迹的内容。
 */
public class Journey extends Id {
    private Long    userId;        //用户ID
    private String  title;         //行程标题
    private Integer status;        //行程状态
    private long    days;          //时间预算
    private long    cost;          //花销预算
    private long    destinationId; //目的地ID
    private Date    createTime;    //创建时间
    private Date    finishTime;    //行程结束时间

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public long getDays() {
        return days;
    }

    public void setDays(long days) {
        this.days = days;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(long destinationId) {
        this.destinationId = destinationId;
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
