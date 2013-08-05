package com.lvzu.core.service;

import com.lvzu.core.entity.User;
import com.lvzu.core.repository.UserMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午4:30
 * Description:
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户总数
     *
     * @param condition 查询条件
     * @return 用户总数
     */
    public long findCount(Map<String, Object> condition) {
        return userMapper.selectCount(condition);
    }

    /**
     * 根据用户ID查找用户实体
     *
     * @param id 用户ID
     * @return 用户实体
     */
    public User find(long id) {
        return userMapper.select(id);
    }

    /**
     * 取出所有的用户
     *
     * @param rowBounds 分页标签
     * @return 用户列表
     */
    public List<User> findAll(RowBounds rowBounds) {
        return userMapper.selectAll(rowBounds);
    }

    /**
     * 根据条件查找用户
     *
     * @param condition 查找条件
     * @return 用户列表
     */
    public List<User> findByCondition(Map<String, Object> condition, RowBounds rowBounds) {
        return userMapper.selectByCondition(condition, rowBounds);
    }
}
