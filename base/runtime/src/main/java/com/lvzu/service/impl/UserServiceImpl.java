package com.lvzu.service.impl;

import com.lvzu.common.Page;
import com.lvzu.dao.UserDao;
import com.lvzu.model.User;
import com.lvzu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-17
 * Time: 下午10:10
 * Description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("mybatis")
    private UserDao userMapper;

    @Override
    public User find(long id) {
        return userMapper.select(id);
    }

    @Override
    public Page<User> findAll(Page<User> page) {
        return userMapper.selectAll(page);
    }

    @Override
    public Page<User> findByCondition(Map<String, Object> condition, Page<User> page) {
        return userMapper.selectByCondition(condition, page);
    }
}
