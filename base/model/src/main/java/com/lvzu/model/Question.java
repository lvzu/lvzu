package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;
import java.util.List;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午10:57
 * Description:提问者的问题内容。会创建游记计划或者只单纯问问题。
 */

public class Question extends Id {

    private long userId;            //提问者ID
    private String  title;          //问题标题
    private String content;         //简单描述
    private int status;             //问题状态:0:问题中 1:问题结束  2:问题关闭
    private List<ScenicSpot> scenicSpots;   //相关联景点
    private long hits;              //点击次数
    private Date    createTime;     //创建时间
    private Date    finishTime;     //问题完成时间
    private Answer  bestAnswer;     //最佳答案

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ScenicSpot> getScenicSpots() {
        return scenicSpots;
    }

    public void setScenicSpots(List<ScenicSpot> scenicSpots) {
        this.scenicSpots = scenicSpots;
    }

    public long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
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

    public Answer getBestAnswer() {
        return bestAnswer;
    }

    public void setBestAnswer(Answer bestAnswer) {
        this.bestAnswer = bestAnswer;
    }
}

