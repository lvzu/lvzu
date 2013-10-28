package com.lvzu.service.impl;

import com.lvzu.common.Page;
import com.lvzu.dao.FollowerDao;
import com.lvzu.model.User;
import com.lvzu.service.FollowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: lianghongbin
 * Date: 13-9-10
 * Time: 下午11:52
 * Description:
 */
@Service
@Transactional
public class FollowerServiceImpl implements FollowerService {

    @Autowired
    @Qualifier("mybatis")
    private FollowerDao followerDao;

    @Override
    public int save(long userId, long followerId, int status) {
        return followerDao.insert(userId, followerId, status);
    }

    @Override
    public int remove(long userId, long followerId) {
        return followerDao.delete(userId, followerId);
    }

    @Override
    public Page<User> findFollowers(Page<User> page, long userId) {
        return followerDao.selectFollowers(page, userId);
    }

    @Override
    public Page<User> findUsers(Page<User> page, long followerId) {
        return followerDao.selectUsers(page, followerId);
    }
}
