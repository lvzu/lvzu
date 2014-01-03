package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.Footmark;
import com.lvzu.model.Journey;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据行程ID取出该行程的足迹数量
     * @param journeyId 行程ID
     * @return 足迹列表数量
     */
    public long selectCountByJourney(long journeyId);

    /**
     * 根据条件查找行程
     * @param page 分页参数
     * @param params 查询参数
     * @return 足迹列表
     */
    public Page<Footmark> selectByCondition(Page<Footmark> page, Map<String, Object> params);

    /**
     * 根据条件查找行程数量
     * @param params 查询参数
     * @return 足迹数
     */
    public long selectCountByCondition(Map<String, Object> params);
}
