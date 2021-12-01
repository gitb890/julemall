package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.FlashPromotionLogDao;
import com.junjie.jule.coupon.entity.FlashPromotionLogEntity;
import com.junjie.jule.coupon.service.FlashPromotionLogService;


@Service("flashPromotionLogService")
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogDao, FlashPromotionLogEntity> implements FlashPromotionLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionLogEntity> page = this.page(
                new Query<FlashPromotionLogEntity>().getPage(params),
                new QueryWrapper<FlashPromotionLogEntity>()
        );

        return new PageUtils(page);
    }

}