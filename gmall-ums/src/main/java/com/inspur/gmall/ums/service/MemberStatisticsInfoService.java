package com.inspur.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.ums.entity.MemberStatisticsInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:44:25
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

