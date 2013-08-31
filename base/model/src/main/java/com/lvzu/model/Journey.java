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
    private Long    userid;        //用户ID
    private String  title;         //行程标题
    private Integer status;        //行程状态
    private long    days;          //时间预算
    private long    cost;          //花销预算
    private long    destinationid; //目的地ID
    private Date    createtime;    //创建时间
    private Date    finishtime;    //行程结束时间

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

    public long getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(long destinationid) {
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
