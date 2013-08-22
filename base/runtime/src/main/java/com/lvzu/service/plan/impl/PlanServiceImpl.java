package com.lvzu.service.plan.impl;

import com.lvzu.common.Page;
import com.lvzu.dao.plan.PlanDao;
import com.lvzu.model.plan.Plan;
import com.lvzu.service.plan.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: lianghongbin
 * Date: 13-8-22
 * Time: 下午11:08
 * Description:
 */
@Service
@Transactional
public class PlanServiceImpl implements PlanService {

    @Autowired
    @Qualifier("mybatis")
    private PlanDao planDao;

    @Override
    public Plan find(long id) {
        return null;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public int update(Plan plan) {
        return 0;
    }

    @Override
    public int save(Plan plan) {
        return 0;
    }

    @Override
    public Page<Plan> findByUser(int userId) {
        return null;
    }

    @Override
    public int finish(int planId) {
        return 0;
    }

    @Override
    public int publish(int planId) {
        return 0;
    }
}
