package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:10
 * Description:游记中的每个足迹。描述一段旅程的内容。
 */
public class FootMark extends Id {


    private long   journeyid;  //游记ID
    private String title;      //足迹标题
    private String content;    //足迹内容
    private Date   createtime; //创建时间

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

}
