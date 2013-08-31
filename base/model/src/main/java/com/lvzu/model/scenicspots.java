package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:07
 * Description:
 */
public class scenicspots extends Id {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
