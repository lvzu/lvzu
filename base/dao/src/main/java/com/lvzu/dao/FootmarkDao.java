package com.lvzu.dao;

import com.lvzu.model.Footmark;
import com.lvzu.model.Journey;

/**
 * User: liuhaiping
 * Date: 13-9-8
 * Time: 下午2:52
 * Description:
 */
public interface FootmarkDao extends BaseDao<Footmark>{
    /**
     * 对提问者回答。
     * @param mode 足迹实体
     * @return 结果标记：成功：0  失败：1
     */
    public int addFootmark(Footmark mode);


    /**
     * 对提问者更新回答。
     * @param mode  足迹实体
     * @return 结果标记：成功：0  失败：1
     */
    public int editFootmark(Footmark mode);

    /**
     * 对提问者删除回答。
     * @param mode  足迹实体
     * @return 结果标记：成功：0  失败：1
     */
    public int removeFootmark(Footmark mode);
}
