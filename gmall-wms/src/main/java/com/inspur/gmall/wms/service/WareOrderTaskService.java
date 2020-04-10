package com.inspur.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.wms.entity.WareOrderTaskEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:49:23
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

