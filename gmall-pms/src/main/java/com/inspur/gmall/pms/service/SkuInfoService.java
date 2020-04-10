package com.inspur.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.pms.entity.SkuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:57:12
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

