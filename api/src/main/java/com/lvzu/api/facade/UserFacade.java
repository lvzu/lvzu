package com.lvzu.api.facade;

import com.lvzu.core.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Administrator
 * Date: 13-8-4
 * Time: 下午7:14
 * Description:
 */
@Service
@Transactional
public interface UserFacade {

    /**
     * 面向app，经过包装过的接口，使对外接口粗粒度化
     * @param id 用户ID
     * @return 用户实体
     */
    public User find(long id);
}
