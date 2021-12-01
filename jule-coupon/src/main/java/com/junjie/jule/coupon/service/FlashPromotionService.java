package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.FlashPromotionEntity;

import java.util.Map;

/**
 * 限时购表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface FlashPromotionService extends IService<FlashPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

