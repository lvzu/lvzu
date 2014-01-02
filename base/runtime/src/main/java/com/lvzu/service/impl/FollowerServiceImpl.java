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

    /**
     * 添加一个关注
     *
     * @param userId     添加者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    @Override
    public int saveFollower(long userId, long followerId) {
        return followerDao.insertFollower(userId, followerId);
    }

    /**
     * 添加一个黑名单
     *
     * @param userId     添加者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    @Override
    public int saveBlack(long userId, long followerId) {
        return followerDao.insertBlack(userId, followerId);
    }

    /**
     * 删除一个关注
     *
     * @param userId     操作者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    @Override
    public int remove(long userId, long followerId) {
        return followerDao.deleteOne(userId, followerId);
    }

    /**
     * 按主键删除一个关注
     *
     * @param id 主键ID
     * @return 影响条数
     */
    @Override
    public int remove(long id) {
        return followerDao.delete(id);
    }

    /**
     * 根据用户ID查找所有该ID的关注者
     *
     * @param page 分页参数
     * @param userId 用户ID
     * @return 关注者列表
     */
    @Override
    public Page<User> findFollowers(Page<User> page, long userId) {
        return followerDao.selectFollowers(page, userId);
    }

    /**
     * 根据用户ID查找所有该ID的关注者数量
     *
     * @param userId 用户ID
     * @return 关注者列表
     */
    @Override
    public long findFollowerCount(long userId) {
        return followerDao.selectFollowerCount(userId);
    }

    /**
     * 根据关注者ID查找其所关注的用户
     *
     * @param page 分页参数
     * @param followerId 关注者ID
     * @return 关注列表
     */
    @Override
    public Page<User> findUsers(Page<User> page, long followerId) {
        return followerDao.selectUsers(page, followerId);
    }

    /**
     * 根据关注者ID查找其所关注的用户数量
     *
     * @param followerId 关注者ID
     * @return 关注列表
     */
    @Override
    public long findUserCount(long followerId) {
        return followerDao.selectUserCount(followerId);
    }
}
