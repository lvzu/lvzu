package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.Question;
import com.lvzu.model.User;

import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-8-31
 * Time: 下午12:33
 * Description:
 */
public interface QuestionService extends BaseService<Question> {

    /**
     * 取出所有的问题
     *
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<Question> findAll(Page<Question> page);

    /**
     * 根据条件查找问题
     *
     * @param condition 查找条件
     * @return 用户列表
     */
    public Page<Question> findByCondition(Map<String, Object> condition, Page<Question> page);

}
