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
 * User: lianghongbin
 * Date: 13-9-6
 * Time: 下午9:43
 * Description:
 */
@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    @Qualifier("mybatis")
    private QuestionDao questionDao;

    /**
     * 取出所有的问题
     *
     * @param page 分页标签
     * @return 用户列表
     */
    @Override
    public Page<Question> findAll(Page<Question> page) {
        return questionDao.selectAll(page);
    }

    /**
     * 根据条件查找问题
     *
     * @param condition 查找条件
     * @return 用户列表
     */
    @Override
    public Page<Question> findByCondition(Map<String, Object> condition, Page<Question> page) {
        return questionDao.selectByCondition(condition, page);
    }

    /**
     * 添加一个实体
     *
     * @param question 实体
     * @return 影响条数
     */
    @Override
    public int save(Question question) {
        return questionDao.insert(question);
    }

    /**
     * 删除一个实体
     *
     * @param id 实体ID
     * @return 影响条数
     */
    @Override
    public int remove(long id) {
        return questionDao.delete(id);
    }

    /**
     * 更新一个实体
     *
     * @param question 实体
     * @return 影响条数
     */
    @Override
    public int edit(Question question) {
        return questionDao.update(question);
    }

    /**
     * 根据ID获取一个实体
     *
     * @param id 实体ID
     * @return 实体
     */
    @Override
    public Question find(long id) {
        return questionDao.select(id);
    }
}
