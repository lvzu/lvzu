package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.Answer;

/**
 * User: liuhaiping
 * Date: 13-8-31
 * Time: 下午5:46
 * Description:
 */
public interface AnswerDao extends BaseDao<Answer>{
    /**
     * 对提问者回答。
     * @param aMode 回答实体
     * @return 结果标记：成功：0  失败：1
     */
    public int answerByQuser(Answer aMode);


    /**
     * 对提问者更新回答。
     * @param aMode  回答者ID
     * @return 结果标记：成功：0  失败：1
     */
    public int updateByAuser(Answer aMode);

    /**
     * 对提问者更新回答。
     * @param aUserId  回答者ID
     * @param answerId 回答内容ID
     * @return 结果标记：成功：0  失败：1
     */
    public int deleteByAuser(long aUserId , long answerId);

}
