package com.inspur.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:44:25
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

