package com.lvzu.service;

import com.lvzu.model.Journey;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午5:09
 * Description:
 */
public interface JourneyService extends BaseService<Journey> {

    /**
     * 结束一个行程
     * @param id 行程ID
     * @return 影响条数
     */
    public int finish(long id);
}
