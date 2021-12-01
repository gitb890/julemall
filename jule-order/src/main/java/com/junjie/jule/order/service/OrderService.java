package com.junjie.jule.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 16:53:37
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

