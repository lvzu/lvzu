package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: lianghongbin
 * Date: 13-8-31
 * Time: 上午11:10
 * Description:游记中的每个足迹。描述一段旅程的内容。
 */
public class Footmark extends Id {

    private long hits;          //点击次数
    private long top;           //被顶次数
    private long journeyId;  //游记ID
    private String title;      //足迹标题
    private String content;    //足迹内容
    private Date createTime; //创建时间

    public long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
    }

    public long getTop() {
        return top;
    }

    public void setTop(long top) {
        this.top = top;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
