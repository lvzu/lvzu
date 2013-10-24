package com.lvzu.service;

import com.lvzu.model.Footmark;

/**
 * User: lianghongbin
 * Date: 13-9-8
 * Time: 下午5:09
 * Description:
 */
public interface FootmarkService {

    /**
     * 创建游记。
     * @param footmark 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int save(Footmark footmark);


    /**
     * 编辑游记。
     * @param footmark  游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int edit(Footmark footmark);

    /**
     * 删除游记。
     * @param footmark  游记实体
     * @return 结果标记：成功：0  失败：1
     */
    public int remove(Footmark footmark);

    /**
     * 根据ID选先足迹
     * @param id 足迹ID
     * @return 足迹
     */
    public Footmark select(long id);

    public
}
