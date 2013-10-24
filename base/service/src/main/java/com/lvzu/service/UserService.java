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
     * 根据用户名称查找用户实体
     *
     * @param username 用户名
     * @return 用户实体
     */
    public User findByUsername(String username);

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

    /**
     * 用户注册
     * @param user  用户信息
     * @return  操作成功/失败状态标识
     */
    public int registUser(User user);

    /**
     * 修改用户注册信息
     * @param user  用户信息
     * @return  操作成功/失败状态标识
     */
    public int modifyUser(User user);

    /**
     * 删除用户
     * @param userId 用户id
     * @param flag  0 逻辑删除 1 物理删除
     * @return    操作成功/失败状态标识
     */
    public  int  deleteUser(int userId,int flag);

}
