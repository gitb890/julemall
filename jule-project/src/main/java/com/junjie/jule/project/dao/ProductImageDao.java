package com.junjie.jule.project.dao;

import com.junjie.jule.project.entity.ProductImageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品图片表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
@Mapper
public interface ProductImageDao extends BaseMapper<ProductImageEntity> {
	
}
