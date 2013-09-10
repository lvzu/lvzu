package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.Question;

import java.util.Map;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 下午5:46
 * Description:
 */
public interface QuestionDao extends BaseDao<Question>{
    /**
     * 对提问者回答。
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int addQuestion(Question qMode);


    /**
     * 对提问者更新回答。
     * @param qMode  提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int updateQuestion(Question qMode);

    /**
     * 对提问者删除回答。
     * @param qUserId  提问者ID
     * @param questionId 问题ID
     * @return 结果标记：成功：0  失败：1
     */
    public int deleteByAuser(long qUserId , long questionId);


    /**
     * 取出所有问题列表。
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<Question> selectAll(Page<Question> page);

    /**
     * 根据条件查找用户
     * @param condition 查找条件
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<Question> selectByCondition(Map<String, Object> condition, Page<Question> page);
}
