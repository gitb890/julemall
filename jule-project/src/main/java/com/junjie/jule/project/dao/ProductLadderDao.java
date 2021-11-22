package com.junjie.jule.project.dao;

import com.junjie.jule.project.entity.ProductLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品阶梯价格表(只针对同商品)
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Mapper
public interface ProductLadderDao extends BaseMapper<ProductLadderEntity> {
	
}
