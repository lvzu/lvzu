package com.lvzu.service.impl;

import com.lvzu.dao.JourneyDao;
import com.lvzu.model.Journey;
import com.lvzu.service.JourneyService;
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
public class JourneyServiceImpl implements JourneyService{
    @Autowired
    @Qualifier("mybatis")
    private JourneyDao journeyDao;

    /**
     * 结束一个行程
     *
     * @param id 行程ID
     * @return 影响条数
     */
    @Override
    public int finish(long id) {
        return journeyDao.finish(id);
    }

    /**
     * 添加一个实体
     *
     * @param journey 实体
     * @return 影响条数
     */
    @Override
    public int save(Journey journey) {
        return journeyDao.insert(journey);
    }

    /**
     * 删除一个实体
     *
     * @param id 实体ID
     * @return 影响条数
     */
    @Override
    public int remove(long id) {
        return journeyDao.delete(id);
    }

    /**
     * 更新一个实体
     *
     * @param journey 实体
     * @return 影响条数
     */
    @Override
    public int edit(Journey journey) {
        return journeyDao.update(journey);
    }

    /**
     * 根据ID获取一个实体
     *
     * @param id 实体ID
     * @return 实体
     */
    @Override
    public Journey find(long id) {
        return journeyDao.select(id);
    }
}
