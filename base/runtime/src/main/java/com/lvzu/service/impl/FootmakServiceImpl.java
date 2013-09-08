package com.lvzu.service.impl;

import com.lvzu.dao.FootmarkDao;
import com.lvzu.dao.QuestionDao;
import com.lvzu.model.Footmark;
import com.lvzu.service.FootmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * User: liuhaiping
 * Date: 13-9-8
 * Time: 下午5:16
 * Description:
 */
public class FootmakServiceImpl implements FootmarkService {
    @Autowired
    @Qualifier("mybatis")
    private FootmarkDao footmarkMapper;
    /**
     * 编辑游记。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int edit(Footmark mode) {
        return footmarkMapper.editFootmark(mode);
    }

    /**
     * 删除游记。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int remove(Footmark mode) {
        return footmarkMapper.removeFootmark(mode);
    }

    /**
     * 创建游记。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int save(Footmark mode) {
        return footmarkMapper.addFootmark(mode);
    }
}
