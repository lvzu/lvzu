package com.lvzu.dao.plan;

import com.lvzu.common.Page;
import com.lvzu.dao.BaseDao;
import com.lvzu.model.plan.Plan;

/**
 * User: lianghongbin
 * Date: 13-8-21
 * Time: 下午11:03
 * Description: 规划数据库操作接口
 */
public interface PlanDao extends BaseDao<Plan> {

    /**
     * 根据用户ID查找其旅游规划
     *
     * @param userId 用户ID
     * @param page   分页参数
     * @return 分页规划
     */
    public Page<Plan> selectByUser(int userId, Page<Plan> page);

    /**
     * 完成该旅游规划
     *
     * @param planId 规划ID
     * @return 影响条数
     */
    public int finish(int planId);

    /**
     * 发布该旅游规划
     *
     * @param planId 规划ID
     * @return 影响条数
     */
    public int publish(int planId);
}
