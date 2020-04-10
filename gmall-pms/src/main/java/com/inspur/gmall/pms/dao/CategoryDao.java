package com.inspur.gmall.pms.dao;

import com.inspur.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:57:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
