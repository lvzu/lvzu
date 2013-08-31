package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:08
 * Description:
 */
public class prevent_advise extends Id {
    private String content;
    private Long answer_id;
    private int type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Long answer_id) {
        this.answer_id = answer_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
