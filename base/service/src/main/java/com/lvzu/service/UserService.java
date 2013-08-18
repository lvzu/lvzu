package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.User;

import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午4:30
 * Description:
 */
public interface UserService {

    /**
     * 根据用户ID查找用户实体
     *
     * @param id 用户ID
     * @return 用户实体
     */
    public User find(long id);

    /**
     * 取出所有的用户
     *
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<User> findAll(Page<User> page);

    /**
     * 根据条件查找用户
     *
     * @param condition 查找条件
     * @return 用户列表
     */
    public Page<User> findByCondition(Map<String, Object> condition, Page<User> page);
}
