package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: lianghongbin
 * Date: 13-8-21
 * Time: 下午10:59
 * Description: 规划回答地址实体类
 */
public class AnswerAddress extends Id {

    private PlanAnswer answer;
    private String city;
    private int sequence;
    private boolean selected;

    public PlanAnswer getAnswer() {
        return answer;
    }

    public void setAnswer(PlanAnswer answer) {
        this.answer = answer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
