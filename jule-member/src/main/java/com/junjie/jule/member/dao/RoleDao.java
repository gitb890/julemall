package com.junjie.jule.member.dao;

import com.junjie.jule.member.entity.RoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户角色表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
@Mapper
public interface RoleDao extends BaseMapper<RoleEntity> {
	
}
