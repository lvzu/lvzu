package com.lvzu.dao.impl;

import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.JourneyDao;
import com.lvzu.model.Journey;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * User: robort
 * Date: 13-9-8
 * Time: 下午5:01
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class JourneyDaoImpl extends MyBatisDaoSupport<Journey> implements JourneyDao {
    /**
     * 对提问者回答。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int addJourney(Journey mode) {
        return 0;
    }

    /**
     * 对提问者更新回答。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int editJourney(Journey mode) {
        return 0;
    }

    /**
     * 对提问者删除回答。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int removeJourny(Journey mode) {
        return 0;
    }
}
