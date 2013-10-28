package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.Footmark;
import com.lvzu.model.Journey;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午2:52
 * Description:
 */
public interface FootmarkDao extends BaseDao<Footmark> {

    /**
     * 点击次数+1
     *
     * @param id 足迹ID
     */
    public void hit(long id);

    /**
     * 顶次数+1
     *
     * @param id 足迹ID
     */
    public void top(long id);

    /**
     * 根据行程ID取出该行程的足迹
     *
     * @param journeyId 行程ID
     * @param page      分页标签
     * @return 足迹列表
     */
    public Page<Footmark> selectByJourney(long journeyId, Page<Footmark> page);
}
