package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.HomeNewProductEntity;

import java.util.Map;

/**
 * 新鲜好物表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface HomeNewProductService extends IService<HomeNewProductEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

