package com.lvzu.api.facade.impl;

import com.lvzu.api.facade.UserFacade;
import com.lvzu.core.entity.User;
import com.lvzu.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午7:15
 * Description:
 */
@Service
@Transactional
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    /**
     * 面向app，经过包装过的接口，使对外接口粗粒度化
     * @param id 用户ID
     * @return 用户实体
     */
    @Override
    public User find(long id) {
        return userService.find(id);
    }
}
