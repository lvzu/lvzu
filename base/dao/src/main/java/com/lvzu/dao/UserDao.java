package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.User;

import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午3:54
 * Description:
 */
public interface UserDao extends BaseDao<User> {

    /**
     * 取出所有的用户
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<User> selectAll(Page<User> page);

    /**
     * 根据用户名称查找用户实体
     *
     * @param username 用户名
     * @return 用户实体
     */
    public User selectByUsername(String username);

    /**
     * 根据条件查找用户
     * @param condition 查找条件
     * @param page 分页标签
     * @return 用户列表
     */
    public Page<User> selectByCondition(Map<String, Object> condition, Page<User> page);


}
