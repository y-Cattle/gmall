package com.inspur.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.inspur.gmall.ums.entity.MemberCollectSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author fujunao
 * @email fujunao@inspur.com
 * @date 2020-04-10 10:44:25
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

