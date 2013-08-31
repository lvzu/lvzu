package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:11
 * Description:目的地 主要是指城市。
 */
public class Destination extends Id {

    private String placename;     //目的地名称
    private long   scenicspotsid; //旅游景点ID
    private String description;   //目的地描述

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public Long getScenicspotsid() {
        return scenicspotsid;
    }

    public void setScenicspotsid(Long scenicspotsid) {
        this.scenicspotsid = scenicspotsid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
