package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.Answer;
import com.lvzu.model.Question;

import java.util.Map;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 下午5:46
 * Description:
 */
public interface AnswerDao extends BaseDao<Answer>{

    /**
     * 获取指定问题的所有回答
     * @param condition 查找条件
     * @param page 分页标签
     * @return 回答列表
     */
    public Page<Answer> selectByQuestion(Map<String, Object> condition, Page<Question> page);

    /**
     * 获取指定人员的所有回答
     * @param condition 查找条件
     * @param page 分页标签
     * @return 回答列表
     */
    public Page<Answer> selectByUser(Map<String, Object> condition, Page<Question> page);

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
    public Answer selectBest(long questionId);
}
