package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.FollowerDao;
import com.lvzu.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 13-9-10
 * Time: 下午11:24
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class FollowerDaoImpl extends MyBatisDaoSupport<User> implements FollowerDao {

    @Override
    public int delete(int userId, int followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("followerId", followerId);

        return insert("deleteByUserFollower", params);
    }

    @Override
    public int insert(int userId, int followerId,int status) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("followerId", followerId);
        params.put("status", status);
        return insert("insertByUserFollower", params);
    }

    @Override
    public Page<User> selectFollowers(Page<User> page, int userId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        return fetchPage("selectFollowers", page, params);
    }

    @Override
    public Page<User> selectUsers(Page<User> page, int followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("followerId", followerId);
        return fetchPage("selectUsers", page, params);
    }

    @Override
    public int cancelFollow(int userId, int followerId,int status,Date cancelTime) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("followerId", followerId);
        params.put("status", status);
        params.put("cancelTime", status);
        return update("cancelFollow", params);
    }
}
