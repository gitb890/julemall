package com.junjie.jule.project.dao;

import com.junjie.jule.project.entity.SkuAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku平台属性值关联表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Mapper
public interface SkuAttrValueDao extends BaseMapper<SkuAttrValueEntity> {
	
}
