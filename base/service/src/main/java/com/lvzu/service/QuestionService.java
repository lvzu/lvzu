package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.Question;
import com.lvzu.model.User;

import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-8-31
 * Time: 下午12:33
 * Description:
 */
public interface QuestionService extends BaseService<Question> {

    /**
     * @param id 问题ID
     * @return 影响条数
     */
    public int hit(long id);

    /**
     * 结束一个问题
     *
     * @param id 问题ID
     * @return 影响条数
     */
    public int finish(long id);

    /**
     * 关闭一个问题（未完成）
     *
     * @param id 问题ID
     * @return 影响条数
     */
    public int close(long id);

    /**
     * 取出所有问题列表。
     *
     * @param page 分页标签
     * @return 问题列表
     */
    public Page<Question> findAll(Page<Question> page);

    /**
     * 根据条件查找用户
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 问题列表
     */
    public Page<Question> findByCondition(Map<String, Object> condition, Page<Question> page);

    /**
     * 根据用户ID查出其所有提问
     *
     * @param condition 查找条件（用户ID）
     * @param page      分页标签
     * @return 问题列表
     */
    public Page<Question> findByUser(Map<String, Object> condition, Page<Question> page);

    /**
     * 设置一个问题的最佳答案
     *
     * @param condition 相关参数
     */
    public void editBest(Map<String, Object> condition);

    /**
     * 根据条件取满足条件的问题条数
     * @param condition 查询问题
     * @return 条数
     */
    public long findCountByCondition(Map<String, Object> condition);

    /**
     * 查询所有问题的条数
     * @return 所有问题条数
     */
    public long findCount();

    /**
     * 查询最新发的问题
     * @param page 分页参数
     * @return 问题列表
     */
    public Page<Question> findLastQuestion(Page<Question> page);

    /**
     * 查询最新被回答过的问题
     * @param page 分页参数
     * @return 问题列表
     */
    public Page<Question> findByLastAnswer(Page<Question> page);

    /**
     * 更新最后被回复的时间
     * @param id 问题ID
     * @return 影响条数
     */
    public int lastAnswer(long id);
}
