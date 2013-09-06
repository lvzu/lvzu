package com.lvzu.dao.impl;

import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.QuestionDao;
import com.lvzu.model.Question;
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
public class QuestionDaoImpl extends MyBatisDaoSupport<Question> implements QuestionDao {

    /**
     * 对提问者更新回答。
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
