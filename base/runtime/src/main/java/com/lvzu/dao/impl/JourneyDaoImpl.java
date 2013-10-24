package com.lvzu.dao.impl;

import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.JourneyDao;
import com.lvzu.model.Journey;
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
public class JourneyDaoImpl extends MyBatisDaoSupport<Journey> implements JourneyDao {

    /**
     * 结束一个行程
     *
     * @param id 游记ID
     * @return 影响条数
     */
    @Override
    public int finish(long id) {
        return update("finish", id);
    }
}
