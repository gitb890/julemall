package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.FlashPromotionProductRelationEntity;

import java.util.Map;

/**
 * 商品限时购与商品关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface FlashPromotionProductRelationService extends IService<FlashPromotionProductRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

