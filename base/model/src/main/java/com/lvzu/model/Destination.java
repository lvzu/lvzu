package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:11
 * Description:目的地 主要是指城市。
 */
public class Destination extends Id {

    private String placeName;     //目的地名称
    private long   scenicSpotsId; //旅游景点ID
    private String description;   //目的地描述

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public long getScenicSpotsId() {
        return scenicSpotsId;
    }

    public void setScenicSpotsId(long scenicSpotsId) {
        this.scenicSpotsId = scenicSpotsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
