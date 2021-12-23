package com.junjie.jule.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.member.entity.RolePermissionRelationEntity;

import java.util.Map;

/**
 * 后台用户角色和权限关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
public interface RolePermissionRelationService extends IService<RolePermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

