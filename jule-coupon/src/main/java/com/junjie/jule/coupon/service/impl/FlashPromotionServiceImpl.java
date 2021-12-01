package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.FlashPromotionDao;
import com.junjie.jule.coupon.entity.FlashPromotionEntity;
import com.junjie.jule.coupon.service.FlashPromotionService;


@Service("flashPromotionService")
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionDao, FlashPromotionEntity> implements FlashPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionEntity> page = this.page(
                new Query<FlashPromotionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionEntity>()
        );

        return new PageUtils(page);
    }

}