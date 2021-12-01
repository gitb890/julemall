package com.junjie.jule.order.dao;

import com.junjie.jule.order.entity.CompanyAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 公司收发货地址表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 16:53:37
 */
@Mapper
public interface CompanyAddressDao extends BaseMapper<CompanyAddressEntity> {
	
}
