package com.lvzu.dao.impl;

import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.FootmarkDao;
import com.lvzu.model.Footmark;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

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
}
