package com.lvzu.service.impl;

import com.lvzu.dao.AnswerDao;
import com.lvzu.model.Answer;
import com.lvzu.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: robort
 * Date: 13-9-6
 * Time: 下午9:43
 * Description:
 */
@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    @Qualifier("mybatis")
    private AnswerDao answerMapper;

    /**
     * 对提问者回答。
     *
     * @param aMode 回答实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int answer(Answer aMode) {
        return answerMapper.answerByQuser(aMode);
    }

    /**
     * 对提问者更新回答。
     *
     * @param aMode 回答者ID
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int modify(Answer aMode) {
        return answerMapper.updateByAuser(aMode);
    }

    /**
     * 对提问者更新回答。
     * @param aUserId  回答者ID
     * @param answerId 回答内容ID
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int remove(long aUserId , long answerId){
        return answerMapper.deleteByAuser(aUserId,answerId);
    }
}
