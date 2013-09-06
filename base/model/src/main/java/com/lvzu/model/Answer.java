package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:11
 * Description:回答问题的内容。
 */
public class Answer extends Id {
    private long questionId;        //问题ID
    private long aUserId;           //回答者ID
    private long qUseriId;          //提问者ID
    private long destinationId;     //目的地ID
    private long scenicSpotsId;     //景点ID
    private long cost;              //预算花销
    private long preventAdviseId;   //防范ID：0：商家1：旅游
    private String food;            //吃相关的描述
    private String hotel;           //住宿相关的描述
    private String despcription;    //回答内容的一段描述。

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public long getaUserId() {
        return aUserId;
    }

    public void setaUserId(long aUserId) {
        this.aUserId = aUserId;
    }

    public long getqUseriId() {
        return qUseriId;
    }

    public void setqUseriId(long qUseriId) {
        this.qUseriId = qUseriId;
    }

    public long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(long destinationId) {
        this.destinationId = destinationId;
    }

    public long getScenicSpotsId() {
        return scenicSpotsId;
    }

    public void setScenicSpotsId(long scenicSpotsId) {
        this.scenicSpotsId = scenicSpotsId;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getPreventAdviseId() {
        return preventAdviseId;
    }

    public void setPreventAdviseId(long preventAdviseId) {
        this.preventAdviseId = preventAdviseId;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDespcription() {
        return despcription;
    }

    public void setDespcription(String despcription) {
        this.despcription = despcription;
    }
}
