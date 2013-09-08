package com.lvzu.dao;

import com.lvzu.model.Journey;
import com.lvzu.model.Question;

/**
 * User: liuhaiping
 * Date: 13-9-8
 * Time: 下午2:50
 * Description:
 */
public interface JourneyDao extends BaseDao<Journey>{
    /**
     * 对提问者回答。
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int addJourney(Journey mode);


    /**
     * 对提问者更新回答。
     * @param mode  游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int editJourney(Journey mode);

    /**
     * 对提问者删除回答。
     * @param mode  游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int removeJourny(Journey mode);
}
