package com.lvzu.service.plan;

import com.lvzu.common.Page;
import com.lvzu.model.plan.Plan;

/**
 * User: lianghongbin
 * Date: 13-8-22
 * Time: 下午11:02
 * Description:
 */
public interface PlanService {

    public Plan find(long id);

    public int delete(long id);

    public int update(Plan plan);

    public int save(Plan plan);

    public Page<Plan> findByUser(int userId);

    public int finish(int planId);

    public int publish(int planId);
}
