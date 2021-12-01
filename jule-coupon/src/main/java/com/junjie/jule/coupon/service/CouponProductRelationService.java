package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.CouponProductRelationEntity;

import java.util.Map;

/**
 * 优惠券和产品的关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface CouponProductRelationService extends IService<CouponProductRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

