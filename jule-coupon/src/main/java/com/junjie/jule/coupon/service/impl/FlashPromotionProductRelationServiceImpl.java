package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.FlashPromotionProductRelationDao;
import com.junjie.jule.coupon.entity.FlashPromotionProductRelationEntity;
import com.junjie.jule.coupon.service.FlashPromotionProductRelationService;


@Service("flashPromotionProductRelationService")
public class FlashPromotionProductRelationServiceImpl extends ServiceImpl<FlashPromotionProductRelationDao, FlashPromotionProductRelationEntity> implements FlashPromotionProductRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionProductRelationEntity> page = this.page(
                new Query<FlashPromotionProductRelationEntity>().getPage(params),
                new QueryWrapper<FlashPromotionProductRelationEntity>()
        );

        return new PageUtils(page);
    }

}