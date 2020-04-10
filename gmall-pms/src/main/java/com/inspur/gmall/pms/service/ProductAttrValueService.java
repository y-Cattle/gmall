package com.inspur.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.pms.entity.ProductAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:57:12
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

