package com.inspur.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.oms.entity.OrderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:41:28
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

