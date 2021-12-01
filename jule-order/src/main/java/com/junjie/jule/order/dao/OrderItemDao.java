package com.junjie.jule.order.dao;

import com.junjie.jule.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单中所包含的商品
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 16:53:37
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
