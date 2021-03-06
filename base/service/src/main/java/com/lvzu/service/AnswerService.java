package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.Answer;

import java.util.List;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-9-6
 * Time: 下午9:39
 * Description:
 */
public interface AnswerService extends BaseService<Answer> {

    /**
     * 获取指定问题的所有回答
     * @param condition 查找条件
     * @param page 分页标签
     * @return 回答列表
     */
    public Page<Answer> findByQuestion(Map<String, Object> condition, Page<Answer> page);

    /**
     * 获取指定人员的所有回答
     * @param condition 查找条件
     * @param page 分页标签
     * @return 回答列表
     */
    public Page<Answer> findByUser(Map<String, Object> condition, Page<Answer> page);

    /**
     * 批量删除
     * @param ids ID列表
     * @return 影响条数（不可信）
     */
    public int batchRemove(List<Long> ids);

    /**
     * 根据条件查询回答
     * @param condition 查询条件
     * @param page 分页参数
     * @return 问题结果列表
     */
    public Page<Answer> findByCondition(Map<String, Object> condition, Page<Answer> page);

    /**
     * 查找特定问题的答案条数
     * @param questionId 问题ID
     * @return 答案条数
     */
    public long findCountByQuestion(long questionId);

    /**
     * 根据人员查询相关的答案数量
     * @param condition 查询条件
     * @return 答案条数
     */
    public long findCountByUser(Map<String, Object> condition);

    /**
     * 根据条件查找答案的条数
     * @param condition 查询条件
     * @return 答案条数
     */
    public long findCountByCondition(Map<String, Object> condition);

    /**
     * 查找所有答案的条数
     * @return 条案条数
     */
    public long findCount();
}
