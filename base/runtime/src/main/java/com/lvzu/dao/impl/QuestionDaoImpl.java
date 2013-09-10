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
 * User: robort
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
     * 根据条件查找用户
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 用户列表
     */
    @Override
    public Page<Question> selectByCondition(Map<String, Object> condition, Page<Question> page) {
        return fetchPage("selectAll", page, condition);
    }

    /**
     * 对提问者删除回答。
     *
     * @param qUserId    提问者ID
     * @param questionId 问题ID
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int deleteByAuser(long qUserId, long questionId) {
        return 0;
    }

    /**
     * 对提问者回答。
     *
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int addQuestion(Question qMode) {
        return 0;
    }

    /**
     * 对提问者更新回答。
     *
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int updateQuestion(Question qMode) {
        return 0;
    }

}
