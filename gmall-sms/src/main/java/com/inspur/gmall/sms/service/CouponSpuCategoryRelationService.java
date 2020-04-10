package com.inspur.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.sms.entity.CouponSpuCategoryRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券分类关联
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:58:26
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

