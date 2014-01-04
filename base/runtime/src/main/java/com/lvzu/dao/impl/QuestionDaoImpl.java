package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.QuestionDao;
import com.lvzu.model.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-9-6
 * Time: 下午9:42
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class QuestionDaoImpl extends MyBatisDaoSupport<Question> implements QuestionDao {

    /**
     * 取出所有问题列表。
     *
     * @param page 分页标签
     * @return 用户列表
     */
    @Override
    public Page<Question> selectAll(Page<Question> page) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        return fetchPage("selectAll", page, parameter);
    }

    /**
     * 根据条件查找问题
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 用户列表
     */
    @Override
    public Page<Question> selectByCondition(Map<String, Object> condition, Page<Question> page) {
        return fetchPage("selectAll", page, condition);
    }

    @Override
    public Page<Question> selectByUser(Map<String, Object> condition, Page<Question> page) {
        return fetchPage("selectByUser", page, condition);
    }

    /**
     * 设置一个问题的最佳答案
     *
     * @param condition 相关参数
     */
    @Override
    public void updateBest(Map<String, Object> condition) {
        update("updateBest", condition);
    }

    /**
     * 根据条件取满足条件的问题条数
     *
     * @param condition 查询问题
     * @return 条数
     */
    @Override
    public long selectCountByCondition(Map<String, Object> condition) {
        return selectCount("selectCountByCondition", condition);
    }

    /**
     * 查询所有问题的条数
     *
     * @return 所有问题条数
     */
    @Override
    public long selectCount() {
        return selectCount("selectCount", null);
    }

    /**
     * 查询最新发的问题
     *
     * @param page 分页参数
     * @return 问题列表
     */
    @Override
    public Page<Question> selectLastQuestion(Page<Question> page) {
        return fetchPage("selectLastQuestion", page, null);
    }

    /**
     * 查询最新被回答过的问题
     *
     * @param page 分页参数
     * @return 问题列表
     */
    @Override
    public Page<Question> selectByLastAnswer(Page<Question> page) {
        return fetchPage("selectByLastAnswer", page, null);
    }

    /**
     * 更新最后被回复的时间
     *
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int lastAnswer(long id) {
        return update("lastAnswer", id);
    }

    /**
     * 增加点击次数
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int hit(long id) {
        return update("hit", id);
    }

    /**
     * 结束一个问题
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int finish(long id) {
        return update("finish", id);
    }

    /**
     * 关闭一个问题
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int close(long id) {
        return update("close", id);
    }
}
