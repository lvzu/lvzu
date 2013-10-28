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
     * 批量删除问题
     * @param ids 问题列表
     * @return 影响条数
     */
    public int batchRemove(List<Long> ids);

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
     * 设置一个问题的最佳答案
     * @param condition 相关参数
     */
    public void updateBest(Map<String, Object> condition);

    /**
     * 选出一个问题的最佳答案
     * @param questionId 问题ID
     * @return 最佳答案
     */
    public Answer findBest(long questionId);
}
