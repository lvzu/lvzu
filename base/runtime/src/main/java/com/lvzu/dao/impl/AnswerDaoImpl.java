package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.AnswerDao;
import com.lvzu.model.Answer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-9-6
 * Time: 下午9:42
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class AnswerDaoImpl extends MyBatisDaoSupport<Answer> implements AnswerDao {

    /**
     * 获取指定问题的所有回答
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 回答列表
     */
    @Override
    public Page<Answer> selectByQuestion(Map<String, Object> condition, Page<Answer> page) {
        return fetchPage("selectByQuestion", page, condition);
    }

    /**
     * 获取指定人员的所有回答
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 回答列表
     */
    @Override
    public Page<Answer> selectByUser(Map<String, Object> condition, Page<Answer> page) {
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
     * 选出一个问题的最佳答案
     *
     * @param questionId 问题ID
     * @return 最佳答案
     */
    @Override
    public Answer selectBest(long questionId) {
        return selectOne("selectBest", questionId);
    }
}
