package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.FlashPromotionLogEntity;

import java.util.Map;

/**
 * 限时购通知记录
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface FlashPromotionLogService extends IService<FlashPromotionLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

