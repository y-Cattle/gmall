package com.inspur.gmall.oms.dao;

import com.inspur.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:41:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
