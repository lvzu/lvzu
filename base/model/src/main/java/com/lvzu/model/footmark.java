package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:10
 * Description:
 */
public class footmark extends Id {


    private Long journeyid;
    private String title;
    private String content;
    private Date createtime;
    private String footmarkcol;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFootmarkcol() {
        return footmarkcol;
    }

    public void setFootmarkcol(String footmarkcol) {
        this.footmarkcol = footmarkcol;
    }
}
