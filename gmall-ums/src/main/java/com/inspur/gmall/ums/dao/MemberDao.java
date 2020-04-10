package com.inspur.gmall.ums.dao;

import com.inspur.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:44:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
