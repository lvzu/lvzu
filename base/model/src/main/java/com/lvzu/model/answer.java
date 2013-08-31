package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:11
 * Description:
 */
public class answer extends Id {
    private Long questionid;
    private Long auserId;
    private Long quseriId;
    private Long destinationid;
    private Long scenicspotsid;
    private Long cost;
    private String defendmerchant;
    private String defendguide;
    private String food;
    private String hotel;
    private String despcription;

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

    public String getDefendmerchant() {
        return defendmerchant;
    }

    public void setDefendmerchant(String defendmerchant) {
        this.defendmerchant = defendmerchant;
    }

    public String getDefendguide() {
        return defendguide;
    }

    public void setDefendguide(String defendguide) {
        this.defendguide = defendguide;
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
