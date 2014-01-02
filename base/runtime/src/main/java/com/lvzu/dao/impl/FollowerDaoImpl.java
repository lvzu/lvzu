package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.FollowerDao;
import com.lvzu.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

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
    public int deleteOne(long userId, long followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("followerId", followerId);

        return insert("deleteByUserFollower", params);
    }

    @Override
    public int delete(long id) {
        return delete("delete", id);
    }

    @Override
    public int insertFollower(long userId, long followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("followerId", followerId);
        return insert("insertFollower", params);
    }

    @Override
    public int insertBlack(long userId, long followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("followerId", followerId);
        return insert("insertBlack", params);
    }

    @Override
    public Page<User> selectFollowers(Page<User> page, long userId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        return fetchPage("selectFollowers", page, params);
    }

    /**
     * 根据用户ID查找所有该ID的黑名单
     *
     * @param page   分页参数
     * @param userId 用户ID
     * @return 黑名单列表
     */
    @Override
    public Page<User> selectBlacklist(Page<User> page, long userId) {
        Map<String, Object> params = new HashMap<String, Object>(1);
        params.put("userId", userId);
        return fetchPage("selectBlacklist", page, params);
    }

    /**
     * 根据用户ID查找所有该ID的黑名单数量
     *
     * @param userId 用户ID
     * @return 黑名单列表数量
     */
    @Override
    public long selectBlacklistCount(long userId) {
        return selectCount("selectBlacklistCount", userId);
    }

    @Override
    public long selectFollowerCount(long userId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        return selectCount("selectFollowerCount", params);
    }

    @Override
    public Page<User> selectUsers(Page<User> page, long followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("followerId", followerId);
        return fetchPage("selectUsers", page, params);
    }

    @Override
    public long selectUserCount(long followerId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("followerId", followerId);
        return selectCount("selectUserCount", params);
    }
}
