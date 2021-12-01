package com.junjie.jule.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.coupon.entity.HomeAdvertiseEntity;

import java.util.Map;

/**
 * 首页轮播广告表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
public interface HomeAdvertiseService extends IService<HomeAdvertiseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

