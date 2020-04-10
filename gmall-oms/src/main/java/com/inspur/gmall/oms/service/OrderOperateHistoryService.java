package com.inspur.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.oms.entity.OrderOperateHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单操作历史记录
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:41:28
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

