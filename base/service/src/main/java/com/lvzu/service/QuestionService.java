package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.Question;
import com.lvzu.model.User;

import java.util.Map;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 下午12:33
 * Description:
 */
public interface QuestionService {
    /**
     * 对提问者回答。
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int saveQuestion(Question qMode);


    /**
     * 对提问者更新回答。
     * @param qMode  提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int editQuestion(Question qMode);

    /**
     * 对提问者更新回答。
     * @param qUserId  提问者ID
     * @param questionId 问题ID
     * @return 结果标记：成功：0  失败：1
     */
    public int removeByAuser(long qUserId , long questionId);

    /**
     * 取出所有的问题
     *
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<Question> findAll(Page<Question> page);

    /**
     * 根据条件查找问题
     *
     * @param condition 查找条件
     * @return 用户列表
     */
    public Page<Question> findByCondition(Map<String, Object> condition, Page<Question> page);

}
