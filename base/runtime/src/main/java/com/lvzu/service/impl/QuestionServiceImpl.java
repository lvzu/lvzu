package com.lvzu.service.impl;

import com.lvzu.dao.QuestionDao;
import com.lvzu.model.Question;
import com.lvzu.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * User: robort
 * Date: 13-9-6
 * Time: 下午9:43
 * Description:
 */
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
        return questionMapper.updateQuestion(qMode);
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
        return questionMapper.deleteByAuser(qUserId,questionId);
    }

    /**
     * 对提问者回答。
     *
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int saveQuestion(Question qMode) {
        return questionMapper.addQuestion(qMode);
    }
}
