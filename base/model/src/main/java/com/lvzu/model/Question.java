package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午10:57
 * Description:
 */

public class Question extends Id {


    private Long userId;
    private Long journeyid;
    private String title;
    private String description;
    private Integer status;
    private Date createtime;
    private Date finishtime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getJourneyid() {
        return journeyid;
    }

    public void setJourneyid(Long journeyid) {
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

