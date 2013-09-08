package com.lvzu.dao.impl;

import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.FootmarkDao;
import com.lvzu.model.Footmark;
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
public class FootmarkDaoImpl extends MyBatisDaoSupport<Footmark> implements FootmarkDao {
    /**
     * 对提问者回答。
     *
     * @param mode 足迹实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int addFootmark(Footmark mode) {
        return 0;
    }

    /**
     * 对提问者更新回答。
     *
     * @param mode 足迹实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int editFootmark(Footmark mode) {
        return 0;
    }

    /**
     * 对提问者删除回答。
     *
     * @param mode 足迹实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int removeFootmark(Footmark mode) {
        return 0;
    }
}
