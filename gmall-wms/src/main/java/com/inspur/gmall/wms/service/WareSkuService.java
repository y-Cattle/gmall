package com.inspur.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.wms.entity.WareSkuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品库存
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:49:23
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

