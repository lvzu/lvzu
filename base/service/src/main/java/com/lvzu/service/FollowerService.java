package com.lvzu.service;

import com.lvzu.common.Page;
import com.lvzu.model.User;

/**
 * User: lianghongbin
 * Date: 13-9-10
 * Time: 下午11:34
 * Description:
 */
public interface FollowerService {

    /**
     * 添加一个关注
     * @param userId 添加者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int save(int userId, int followerId);

    /**
     * 删除一个关注
     * @param userId 操作者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int delete(int userId, int followerId);

    /**
     * 根据用户ID查找所有该ID的关注者
     * @param userId 用户ID
     * @return 关注者列表
     */
    public Page<User> findFollowers(Page<User> page, int userId);

    /**
     * 根据关注者ID查找其所关注的用户
     * @param followerId 关注者ID
     * @return 关注列表
     */
    public Page<User> findUsers(Page<User> page, int followerId);
}
