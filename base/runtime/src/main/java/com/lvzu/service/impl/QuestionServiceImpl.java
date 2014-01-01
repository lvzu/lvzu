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
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int hit(long id) {
        return questionDao.hit(id);
    }

    /**
     * 结束一个问题
     *
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int finish(long id) {
        return questionDao.finish(id);
    }

    /**
     * 关闭一个问题（未完成）
     *
     * @param id 问题ID
     * @return 影响条数
     */
    @Override
    public int close(long id) {
        return questionDao.close(id);
    }

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
     * 根据用户ID查出其所有提问
     *
     * @param condition 查找条件（用户ID）
     * @param page      分页标签
     * @return 问题列表
     */
    @Override
    public Page<Question> findByUser(Map<String, Object> condition, Page<Question> page) {
        return questionDao.selectByUser(condition, page);
    }

    /**
     * 设置一个问题的最佳答案
     *
     * @param condition 相关参数
     */
    @Override
    public void editBest(Map<String, Object> condition) {
        questionDao.updateBest(condition);
    }

    /**
     * 根据条件取满足条件的问题条数
     *
     * @param condition 查询问题
     * @return 条数
     */
    @Override
    public long findCountByCondition(Map<String, Object> condition) {
        return questionDao.selectCountByCondition(condition);
    }

    /**
     * 查询所有问题的条数
     *
     * @return 所有问题条数
     */
    @Override
    public long findCount() {
        return questionDao.selectCount();
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
