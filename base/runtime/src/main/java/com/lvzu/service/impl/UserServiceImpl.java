package com.lvzu.service.impl;

import com.lvzu.common.Page;
import com.lvzu.common.RuntimeConstants;
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
    public User findByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public Page<User> findAll(Page<User> page) {
        return userMapper.selectAll(page);
    }

    @Override
    public Page<User> findByCondition(Map<String, Object> condition, Page<User> page) {
        return userMapper.selectByCondition(condition, page);
    }

    @Override
    public int registUser(User user) {
        return userMapper.insert(user)  ;
    }

    @Override
    public int modifyUser(User user) {
        return userMapper.update(user);
    }

    @Override
    public int deleteUser(int userId, int flag) {
        int result = -1;  //操作标志位
        try {
            // 逻辑删除     常量暂时先不定义，留待之后加入
            if(flag== RuntimeConstants.DELETE_LOGIC){
                User userInfo=userMapper.select(userId );
                userInfo.setValidStatus(RuntimeConstants.STATUS_NOTVALID);
                userMapper.update(userInfo);
                result = RuntimeConstants.OPERATE_SUCCESS;
            }else {  //物理删除
                userMapper.delete(userId)  ;
                result = RuntimeConstants.OPERATE_SUCCESS;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
