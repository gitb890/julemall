package com.junjie.jule.order.dao;

import com.junjie.jule.order.entity.CartItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物车表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 16:53:37
 */
@Mapper
public interface CartItemDao extends BaseMapper<CartItemEntity> {
	
}
