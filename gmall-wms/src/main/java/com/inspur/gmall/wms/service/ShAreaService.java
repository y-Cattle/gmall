package com.inspur.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.wms.entity.ShAreaEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:49:23
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

