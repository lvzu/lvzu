package com.lvzu.dao;

import com.lvzu.model.Answer;
import com.lvzu.model.Question;

/**
 * User: robort
 * Date: 13-8-31
 * Time: 下午5:46
 * Description:
 */
public interface QuestionDao extends BaseDao<Question>{
    /**
     * 对提问者回答。
     * @param qMode 提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int addQuestion(Question qMode);


    /**
     * 对提问者更新回答。
     * @param qMode  提问实体
     * @return 结果标记：成功：0  失败：1
     */
    public int updateQuestion(Question qMode);

    /**
     * 对提问者更新回答。
     * @param qUserId  提问者ID
     * @param questionId 问题ID
     * @return 结果标记：成功：0  失败：1
     */
    public int deleteByAuser(long qUserId , long questionId);
}
