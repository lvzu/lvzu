package com.lvzu.service;

import com.lvzu.model.Journey;

/**
 * User: robort
 * Date: 13-9-8
 * Time: 下午5:09
 * Description:
 */
public interface JourneyService {
    /**
     * 创建游记。
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int save(Journey mode);


    /**
     * 编辑游记。
     * @param mode  游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int edit(Journey mode);

    /**
     * 删除游记。
     * @param mode  游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int remove(Journey mode);

}
