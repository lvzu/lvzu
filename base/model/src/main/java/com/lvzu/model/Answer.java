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

    public Long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    public Long getAuserId() {
        return auserId;
    }

    public void setAuserId(Long auserId) {
        this.auserId = auserId;
    }

    public Long getQuseriId() {
        return quseriId;
    }

    public void setQuseriId(Long quseriId) {
        this.quseriId = quseriId;
    }

    public Long getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(Long destinationid) {
        this.destinationid = destinationid;
    }

    public Long getScenicspotsid() {
        return scenicspotsid;
    }

    public void setScenicspotsid(Long scenicspotsid) {
        this.scenicspotsid = scenicspotsid;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getFood() {
        return food;
    }

    public Long getPreventadviseid() {
        return preventadviseid;
    }

    public void setPreventadviseid(Long preventadviseid) {
        this.preventadviseid = preventadviseid;
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
