package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.CouponProductCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券和产品分类关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface CouponProductCategoryRelationService extends IService<CouponProductCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

