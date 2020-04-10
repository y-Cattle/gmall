package com.inspur.gmall.wms.dao;

import com.inspur.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:49:23
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
