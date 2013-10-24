package com.lvzu.service.impl;

import com.lvzu.common.Page;
import com.lvzu.dao.QuestionDao;
import com.lvzu.model.Question;
import com.lvzu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * User: robort
 * Date: 13-9-6
 * Time: 下午9:43
 * Description:
 */
@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    @Qualifier("mybatis")
    private QuestionDao questionMapper;

    /**
     * 对提问者更新回答。
     *
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int editQuestion(Question qMode) {
        return questionMapper.update(qMode);
    }

    /**
     * 对提问者更新回答。
     *
     * @param qUserId    提问者ID
     * @param questionId 问题ID
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int removeByAuser(long qUserId, long questionId) {
        return questionMapper.delete(qUserId, questionId);
    }

    /**
     * 对提问者回答。
     *
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int saveQuestion(Question qMode) {
        return questionMapper.insert(qMode);
    }

    /**
     * 取出所有的问题
     *
     * @param page 分页标签
     * @return 用户列表
     */
    @Override
    public Page<Question> findAll(Page<Question> page) {
        return questionMapper.selectAll(page);
    }

    /**
     * 根据条件查找问题
     *
     * @param condition 查找条件
     * @return 用户列表
     */
    @Override
    public Page<Question> findByCondition(Map<String, Object> condition, Page<Question> page) {
        return questionMapper.selectByCondition(condition, page);
    }
}
