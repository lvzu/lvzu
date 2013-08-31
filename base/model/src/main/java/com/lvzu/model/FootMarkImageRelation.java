package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:10
 * Description:足迹与相关图片的表。
 */
public class FootMarkImageRelation extends Id {
    private  long footmark_id; //足迹ID
    private  long img_id;      //图片ID

    public long getFootmark_id() {
        return footmark_id;
    }

    public void setFootmark_id(long footmark_id) {
        this.footmark_id = footmark_id;
    }

    public long getImg_id() {
        return img_id;
    }

    public void setImg_id(long img_id) {
        this.img_id = img_id;
    }
}
