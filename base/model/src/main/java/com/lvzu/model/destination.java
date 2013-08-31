package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:11
 * Description:
 */
public class destination extends Id {

    private String placename;
    private Long scenicspotsid;
    private String description;

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
