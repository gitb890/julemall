package com.junjie.jule.project.dao;

import com.junjie.jule.project.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
