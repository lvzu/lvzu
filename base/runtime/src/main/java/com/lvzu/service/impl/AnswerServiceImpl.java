package com.lvzu.service.impl;

import com.lvzu.common.Page;
import com.lvzu.dao.AnswerDao;
import com.lvzu.model.Answer;
import com.lvzu.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-9-6
 * Time: 下午9:43
 * Description:
 */
@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    @Qualifier("mybatis")
    private AnswerDao answerDao;

    /**
     * 批量删除问题
     *
     * @param ids 问题列表
     * @return 影响条数
     */
    @Override
    public int batchRemove(List<Long> ids) {
        return answerDao.batchDelete(ids);
    }

    /**
     * 根据条件查询回答
     *
     * @param condition 查询条件
     * @param page      分页参数
     * @return 问题结果列表
     */
    @Override
    public Page<Answer> findByCondition(Map<String, Object> condition, Page<Answer> page) {
        return answerDao.selectByCondition(condition, page);
    }

    /**
     * 查找特定问题的答案条数
     *
     * @param questionId 问题ID
     * @return 答案条数
     */
    @Override
    public long findCountByQuestion(long questionId) {
        return answerDao.selectCountByQuestion(questionId);
    }

    /**
     * 根据人员查询相关的答案数量
     *
     * @param condition 查询条件
     * @return 答案条数
     */
    @Override
    public long findCountByUser(Map<String, Object> condition) {
        return answerDao.selectCountByUser(condition);
    }

    /**
     * 根据条件查找答案的条数
     *
     * @param condition 查询条件
     * @return 答案条数
     */
    @Override
    public long findCountByCondition(Map<String, Object> condition) {
        return answerDao.selectCountByCondition(condition);
    }

    /**
     * 查找所有答案的条数
     *
     * @return 条案条数
     */
    @Override
    public long findCount() {
        return answerDao.selectCount();
    }

    /**
     * 获取指定问题的所有回答
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 回答列表
     */
    @Override
    public Page<Answer> findByQuestion(Map<String, Object> condition, Page<Answer> page) {
        return answerDao.selectByCondition(condition, page);
    }

    /**
     * 获取指定人员的所有回答
     *
     * @param condition 查找条件
     * @param page      分页标签
     * @return 回答列表
     */
    @Override
    public Page<Answer> findByUser(Map<String, Object> condition, Page<Answer> page) {
        return answerDao.selectByUser(condition, page);
    }

    /**
     * 添加一个实体
     *
     * @param answer 实体
     * @return 影响条数
     */
    @Override
    public int save(Answer answer) {
        return answerDao.insert(answer);
    }

    /**
     * 删除一个实体
     *
     * @param id 实体ID
     * @return 影响条数
     */
    @Override
    public int remove(long id) {
        return answerDao.delete(id);
    }

    /**
     * 更新一个实体
     *
     * @param answer 实体
     * @return 影响条数
     */
    @Override
    public int edit(Answer answer) {
        return answerDao.update(answer);
    }

    /**
     * 根据ID获取一个实体
     *
     * @param id 实体ID
     * @return 实体
     */
    @Override
    public Answer find(long id) {
        return answerDao.select(id);
    }
}
