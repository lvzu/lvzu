package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 上午11:10
 * Description:
 */
public class footmark_image_relation extends Id {
    private  Long footmark_id;
    private  Long img_id;

    public Long getFootmark_id() {
        return footmark_id;
    }

    public void setFootmark_id(Long footmark_id) {
        this.footmark_id = footmark_id;
    }

    public Long getImg_id() {
        return img_id;
    }

    public void setImg_id(Long img_id) {
        this.img_id = img_id;
    }
}
