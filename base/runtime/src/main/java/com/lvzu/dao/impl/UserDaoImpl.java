package com.lvzu.dao.impl;

import com.lvzu.common.Page;
import com.lvzu.common.dao.mybatis.MyBatisDaoSupport;
import com.lvzu.dao.UserDao;
import com.lvzu.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-17
 * Time: 下午9:49
 * Description:
 */
@Repository
@Qualifier("mybatis")
public class UserDaoImpl extends MyBatisDaoSupport<User> implements UserDao {

    @Override
    public Page<User> selectAll(Page<User> page) {
        Map<String, Object> parameter = new HashMap<String, Object>();
        return fetchPage("selectAll", page, parameter);
    }

    @Override
    public Page<User> selectByCondition(Map<String, Object> condition, Page<User> page) {
        return fetchPage("selectAll", page, condition);
    }
}
