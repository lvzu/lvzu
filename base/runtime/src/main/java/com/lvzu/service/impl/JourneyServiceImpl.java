package com.lvzu.service.impl;

import com.lvzu.dao.JourneyDao;
import com.lvzu.dao.QuestionDao;
import com.lvzu.model.Journey;
import com.lvzu.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: robort
 * Date: 13-9-8
 * Time: 下午5:16
 * Description:
 */
@Service
@Transactional
public class JourneyServiceImpl implements JourneyService{
    @Autowired
    @Qualifier("mybatis")
    private JourneyDao journeyMapper;
    /**
     * 编辑游记。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int edit(Journey mode) {
        return journeyMapper.editJourney(mode);
    }

    /**
     * 删除游记。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int remove(Journey mode) {
        return journeyMapper.removeJourny(mode);
    }

    /**
     * 创建游记。
     *
     * @param mode 游记实体
     * @return 结果标记：成功：0  失败：1
     */
    @Override
    public int save(Journey mode) {
        return journeyMapper.addJourney(mode);
    }
}
