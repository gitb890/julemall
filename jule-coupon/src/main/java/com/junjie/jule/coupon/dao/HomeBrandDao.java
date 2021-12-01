package com.junjie.jule.coupon.dao;

import com.junjie.jule.coupon.entity.HomeBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页推荐品牌表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@Mapper
public interface HomeBrandDao extends BaseMapper<HomeBrandEntity> {
	
}
