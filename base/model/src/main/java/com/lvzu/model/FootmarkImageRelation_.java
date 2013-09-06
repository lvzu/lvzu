package com.lvzu.model;

import com.lvzu.common.Id;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:10
 * Description:足迹与相关图片的表。
 */
public class FootmarkImageRelation extends Id {
    private  long footmarkId; //足迹ID
    private  long imgId;      //图片ID

    public long getFootmarkId() {
        return footmarkId;
    }

    public void setFootmarkId(long footmarkId) {
        this.footmarkId = footmarkId;
    }

    public long getImgId() {
        return imgId;
    }

    public void setImgId(long imgId) {
        this.imgId = imgId;
    }
}
