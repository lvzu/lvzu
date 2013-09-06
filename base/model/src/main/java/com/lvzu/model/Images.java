package com.lvzu.model;

import com.lvzu.common.Id;

import java.util.Date;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 上午11:09
 * Description:统一管理图片的表。
 */
public class Images extends Id {
    private String  name;       //图片名称
    private String  suffix;     //后缀名
    private String  url;        //地址
    private String  width;      //宽度
    private String  height;     //高度
    private int     status;     //状态
    private Date    createTime; //创建时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
