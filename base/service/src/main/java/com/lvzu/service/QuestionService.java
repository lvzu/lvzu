package com.lvzu.service;

import com.lvzu.model.Question;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 下午12:33
 * Description:
 */
public interface QuestionService {
    /**
     * 对提问者回答。
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int saveQuestion(Question qMode);


    /**
     * 对提问者更新回答。
     * @param qMode  提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int editQuestion(Question qMode);

    /**
     * 对提问者更新回答。
     * @param qUserId  提问者ID
     * @param questionId 问题ID
     * @return 结果标记：成功：0  失败：1
     */
    public int removeByAuser(long qUserId , long questionId);

}
