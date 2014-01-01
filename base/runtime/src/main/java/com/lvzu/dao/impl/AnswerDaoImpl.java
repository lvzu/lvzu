package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.AnswerDao;
import com.lvzu.model.Answer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
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
     * 批量删除
     *
     * @param ids ID列表
     * @return 影响条数（不可信）
     */
    @Override
    public int batchDelete(List<Long> ids) {
        return selectOne("batchDelete", ids);
    }

    /**
     * 根据条件查询回答
     *
     * @param condition 查询条件
     * @param page      分页参数
     * @return 问题结果列表
     */
    @Override
    public Page<Answer> selectByCondition(Map<String, Object> condition, Page<Answer> page) {
        return fetchPage("selectByCondition", page, condition);
    }

    /**
     * 查找特定问题的答案条数
     *
     * @param questionId 问题ID
     * @return 答案条数
     */
    @Override
    public long selectCountByQuestion(long questionId) {
        return selectCount("selectCountByQuestion", questionId);
    }

    /**
     * 根据人员查询相关的答案数量
     *
     * @param condition 查询条件
     * @return 答案条数
     */
    @Override
    public long selectCountByUser(Map<String, Object> condition) {
        return selectCount("selectCountByUser", condition);
    }

    /**
     * 根据条件查找答案的条数
     *
     * @param condition 查询条件
     * @return 答案条数
     */
    @Override
    public long selectCountByCondition(Map<String, Object> condition) {
        return selectCount("selectCountByCondition", condition);
    }

    /**
     * 查找所有答案的条数
     *
     * @return 条案条数
     */
    @Override
    public long selectCount() {
        return selectCount("selectCount", null);
    }
}
