package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.Footmark;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午5:09
 * Description:
 */
public interface FootmarkService extends BaseService<Footmark> {

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
    public Page<Footmark> findByJourney(long journeyId, Page<Footmark> page);
}
