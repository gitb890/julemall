package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.CouponProductRelationDao;
import com.junjie.jule.coupon.entity.CouponProductRelationEntity;
import com.junjie.jule.coupon.service.CouponProductRelationService;


@Service("couponProductRelationService")
public class CouponProductRelationServiceImpl extends ServiceImpl<CouponProductRelationDao, CouponProductRelationEntity> implements CouponProductRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponProductRelationEntity> page = this.page(
                new Query<CouponProductRelationEntity>().getPage(params),
                new QueryWrapper<CouponProductRelationEntity>()
        );

        return new PageUtils(page);
    }

}