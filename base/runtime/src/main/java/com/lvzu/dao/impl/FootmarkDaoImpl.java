package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.FootmarkDao;
import com.lvzu.model.Footmark;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午5:01
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class FootmarkDaoImpl extends MyBatisDaoSupport<Footmark> implements FootmarkDao {

    /**
     * 点击次数+1
     *
     * @param id 足迹ID
     */
    @Override
    public void hit(long id) {
        update("hit", id);
    }

    /**
     * 顶次数+1
     *
     * @param id 足迹ID
     */
    @Override
    public void top(long id) {
        update("top", id);
    }

    /**
     * 根据行程ID取出该行程的足迹
     *
     * @param journeyId 行程ID
     * @return 足迹列表
     */
    @Override
    public Page<Footmark> selectByJourney(long journeyId, Page<Footmark> page) {
        Map<String, Object> param = new HashMap<String, Object>(1);
        param.put("journeyId", journeyId);
        return fetchPage("selectByJourney", page, param);
    }

    /**
     * 根据行程ID取出该行程的足迹数量
     *
     * @param journeyId 行程ID
     * @return 足迹列表数量
     */
    @Override
    public long selectCountByJourney(long journeyId) {
        return selectCount("selectCountByJourney", journeyId);
    }

    /**
     * 根据条件查找行程
     *
     * @param page   分页参数
     * @param params 查询参数
     * @return 足迹列表
     */
    @Override
    public Page<Footmark> selectByCondition(Page<Footmark> page, Map<String, Object> params) {
        return fetchPage("selectByCondition", page, params);
    }

    /**
     * 根据条件查找行程数量
     *
     * @param params 查询参数
     * @return 足迹数
     */
    @Override
    public long selectCountByCondition(Map<String, Object> params) {
        return selectCount("selectCountByCondition", params);
    }
}
