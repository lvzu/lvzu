package com.lvzu.service;

/**
 * User: lianghongbin
 * Date: 10/28/13
 * Time: 1:30 下午
 * Description:
 */
public interface BaseService<T> {

    /**
     * 添加一个实体
     * @param t 实体
     * @return 影响条数
     */
    public int save(T t);

    /**
     * 删除一个实体
     * @param id 实体ID
     * @return 影响条数
     */
    public int remove(long id);

    /**
     * 更新一个实体
     * @param t 实体
     * @return 影响条数
     */
    public int edit(T t);

    /**
     * 根据ID获取一个实体
     * @param id 实体ID
     * @return 实体
     */
    public T find(long id);
}
