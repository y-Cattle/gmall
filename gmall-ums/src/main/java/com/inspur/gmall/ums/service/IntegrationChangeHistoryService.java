package com.inspur.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.ums.entity.IntegrationChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:44:25
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

