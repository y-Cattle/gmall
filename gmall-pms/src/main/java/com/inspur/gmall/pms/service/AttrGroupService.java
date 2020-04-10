package com.inspur.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:57:12
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

