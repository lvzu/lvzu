package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:11
 * Description:回答问题的内容。
 */
public class Answer extends Id {
    private long questionid;        //问题ID
    private long auserId;           //回答者ID
    private long quseriId;          //提问者ID
    private long destinationid;     //目的地ID
    private long scenicspotsid;     //景点ID
    private long cost;              //预算花销
    private long preventadviseid;   //防范ID：0：商家1：旅游
    private String food;            //吃相关的描述
    private String hotel;           //住宿相关的描述
    private String despcription;    //回答内容的一段描述。

    public long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(long questionid) {
        this.questionid = questionid;
    }

    public long getAuserId() {
        return auserId;
    }

    public void setAuserId(long auserId) {
        this.auserId = auserId;
    }

    public long getQuseriId() {
        return quseriId;
    }

    public void setQuseriId(long quseriId) {
        this.quseriId = quseriId;
    }

    public long getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(long destinationid) {
        this.destinationid = destinationid;
    }

    public long getScenicspotsid() {
        return scenicspotsid;
    }

    public void setScenicspotsid(long scenicspotsid) {
        this.scenicspotsid = scenicspotsid;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getPreventadviseid() {
        return preventadviseid;
    }

    public void setPreventadviseid(long preventadviseid) {
        this.preventadviseid = preventadviseid;
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
