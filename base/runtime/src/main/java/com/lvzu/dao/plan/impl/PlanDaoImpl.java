package com.lvzu.dao.plan.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.plan.PlanDao;
import com.lvzu.model.plan.Plan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: lianghongbin
 * Date: 13-8-22
 * Time: 下午11:11
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class PlanDaoImpl extends MyBatisDaoSupport<Plan> implements PlanDao {

    @Override
    public Page<Plan> selectByUser(int userId, Page<Plan> page) {
        return fetchPage("selectByUser", page, null);
    }

    @Override
    public int finish(int planId) {
        return update("finish", planId);
    }

    @Override
    public int publish(int planId) {
        return update("publish", planId);
    }
}
