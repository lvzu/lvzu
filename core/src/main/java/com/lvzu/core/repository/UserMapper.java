package com.lvzu.core.repository;

import com.lvzu.core.entity.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午3:54
 * Description:
 */
@Repository
public interface UserMapper {

    /**
     * 获取用户总数
     * @param condition 查询条件
     * @return 用户总数
     */
    public long selectCount(Map<String, Object> condition);

    /**
     * 根据用户ID查找用户实体
     * @param id 用户ID
     * @return 用户实体
     */
    public User select(long id);

    /**
     * 取出所有的用户
     * @param rowBounds 分页标签
     * @return 用户列表
     */
    public List<User> selectAll(RowBounds rowBounds);

    /**
     * 根据条件查找用户
     * @param condition 查找条件
     * @return 用户列表
     */
    public List<User> selectByCondition(Map<String, Object> condition, RowBounds rowBounds);
}
