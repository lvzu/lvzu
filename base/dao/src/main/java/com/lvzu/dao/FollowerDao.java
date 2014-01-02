package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.User;

/**
 * User: lianghongbin
 * Date: 13-9-10
 * Time: 下午11:19
 * Description:
 */
public interface FollowerDao extends BaseDao<User> {

    /**
     * 添加一个关注
     * @param userId 添加者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int insertFollower(long userId, long followerId);

    /**
     * 添加一个黑名单
     * @param userId 添加者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int insertBlack(long userId, long followerId);

    /**
     * 删除一个关注
     * @param userId 操作者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int deleteOne(long userId, long followerId);

    /**
     * 根据用户ID查找所有该ID的关注者
     * @param userId 用户ID
     * @return 关注者列表
     */
    public Page<User> selectFollowers(Page<User> page, long userId);

    /**
     * 根据用户ID查找所有该ID的黑名单
     * @param page 分页参数
     * @param userId 用户ID
     * @return 黑名单列表
     */
    public Page<User> selectBlacklist(Page<User> page, long userId);

    /**
     * 根据用户ID查找所有该ID的黑名单数量
     * @param userId 用户ID
     * @return 黑名单列表数量
     */
    public long selectBlacklistCount(long userId);

    /**
     * 根据用户查找所有该ID的关注者数量
     * @param userId 用户ID
     * @return 关注者数量
     */
    public long selectFollowerCount(long userId);

    /**
     * 根据关注者ID查找其所关注的用户
     * @param followerId 关注者ID
     * @return 关注列表
     */
    public Page<User> selectUsers(Page<User> page, long followerId);

    /**
     * 根据关注者ID查找其所关注的用户数量
     * @param followerId 关注者ID
     * @return 关注用户数
     */
    public long selectUserCount(long followerId);
}
