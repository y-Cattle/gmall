package com.inspur.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.sms.entity.SeckillSessionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 秒杀活动场次
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:58:26
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

