package com.lvzu.service;

import com.lvzu.model.Answer;

/**
 * User: liuhaiping
 * Date: 13-9-6
 * Time: 下午9:39
 * Description:
 */
public interface AnswerService {
    /**
     * 对提问者回答。
     * @param aMode  回答实体
     * @return 结果标记：成功：0  失败：1
     */
    public int answer(Answer aMode);


    /**
     * 对提问者更新回答。
     * @param aMode  回答者ID
     * @return 结果标记：成功：0  失败：1
     */
    public int modify(Answer aMode);

    /**
     * 对提问者更新回答。
     * @param aUserId  回答者ID
     * @param answerId 回答内容ID
     * @return 结果标记：成功：0  失败：1
     */
    public int remove(long aUserId , long answerId);

}
