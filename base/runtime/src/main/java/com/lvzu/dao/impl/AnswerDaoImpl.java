package com.lvzu.dao.impl;

import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.AnswerDao;
import com.lvzu.model.Answer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * User: robort
 * Date: 13-9-6
 * Time: 下午9:42
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class AnswerDaoImpl extends MyBatisDaoSupport<Answer> implements AnswerDao {
    /**
     * 对提问者回答。
     *
     * @param aMode 回答实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int answerByQuser(Answer aMode) {
        return 0;
    }

    /**
     * 对提问者更新回答。
     *
     * @param aMode 回答者ID
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int updateByAuser(Answer aMode) {
        return 0;
    }

    /**
     * 对提问者更新回答。
     * @param aUserId  回答者ID
     * @param answerId 回答内容ID
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int deleteByAuser(long aUserId , long answerId){
        return 0;
    }
}
