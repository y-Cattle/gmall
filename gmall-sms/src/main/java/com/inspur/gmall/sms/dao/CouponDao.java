package com.inspur.gmall.sms.dao;

import com.inspur.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:58:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
