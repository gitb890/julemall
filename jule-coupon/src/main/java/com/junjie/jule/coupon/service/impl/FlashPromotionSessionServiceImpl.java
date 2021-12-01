package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.FlashPromotionSessionDao;
import com.junjie.jule.coupon.entity.FlashPromotionSessionEntity;
import com.junjie.jule.coupon.service.FlashPromotionSessionService;


@Service("flashPromotionSessionService")
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionDao, FlashPromotionSessionEntity> implements FlashPromotionSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionSessionEntity> page = this.page(
                new Query<FlashPromotionSessionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionSessionEntity>()
        );

        return new PageUtils(page);
    }

}