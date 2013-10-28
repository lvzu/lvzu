package com.lvzu.service.impl;

import com.lvzu.common.Page;
import com.lvzu.dao.FootmarkDao;
import com.lvzu.model.Footmark;
import com.lvzu.service.FootmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午5:16
 * Description:
 */
@Service
@Transactional
public class FootmarkServiceImpl implements FootmarkService {
    @Autowired
    @Qualifier("mybatis")
    private FootmarkDao footmarkDao;

    /**
     * 点击次数+1
     *
     * @param id 足迹ID
     */
    @Override
    public void hit(long id) {
        footmarkDao.hit(id);
    }

    /**
     * 顶次数+1
     *
     * @param id 足迹ID
     */
    @Override
    public void top(long id) {
        footmarkDao.top(id);
    }

    /**
     * 根据行程ID取出该行程的足迹
     *
     * @param journeyId 行程ID
     * @param page      分页标签
     * @return 足迹列表
     */
    @Override
    public Page<Footmark> findByJourney(long journeyId, Page<Footmark> page) {
        return footmarkDao.selectByJourney(journeyId, page);
    }

    /**
     * 添加一个实体
     *
     * @param footmark 实体
     * @return 影响条数
     */
    @Override
    public int save(Footmark footmark) {
        return footmarkDao.insert(footmark);
    }

    /**
     * 删除一个实体
     *
     * @param id 实体ID
     * @return 影响条数
     */
    @Override
    public int remove(long id) {
        return footmarkDao.delete(id);
    }

    /**
     * 更新一个实体
     *
     * @param footmark 实体
     * @return 影响条数
     */
    @Override
    public int edit(Footmark footmark) {
        return footmarkDao.update(footmark);
    }

    /**
     * 根据ID获取一个实体
     *
     * @param id 实体ID
     * @return 实体
     */
    @Override
    public Footmark find(long id) {
        return footmarkDao.select(id);
    }
}
