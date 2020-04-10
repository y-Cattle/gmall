package com.inspur.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.wms.entity.WareInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:49:23
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

