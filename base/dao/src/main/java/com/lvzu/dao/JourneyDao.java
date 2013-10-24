package com.lvzu.dao;

import com.lvzu.model.Journey;
import com.lvzu.model.Question;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午2:50
 * Description:
 */
public interface JourneyDao extends BaseDao<Journey>{

    /**
     * 结束一个行程
     * @param id 游记ID
     * @return 影响条数
     */
    public int finish(long id);
}
