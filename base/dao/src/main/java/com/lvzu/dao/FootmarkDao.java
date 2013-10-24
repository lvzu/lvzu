package com.lvzu.dao;

import com.lvzu.model.Footmark;
import com.lvzu.model.Journey;

import java.util.List;

/**
 * User: liuhaiping
 * Date: 13-9-8
 * Time: 下午2:52
 * Description:
 */
public interface FootmarkDao extends BaseDao<Footmark>{

    /**
     * 点击次数+1
     * @param id 足迹ID
     */
    public void hit(long id);

    /**
     * 顶次数+1
     * @param id 足迹ID
     */
    public void top(long id);

    public List<Footmark>
}
