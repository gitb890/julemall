package com.junjie.jule.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.member.entity.AdminPermissionRelationEntity;

import java.util.Map;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
public interface AdminPermissionRelationService extends IService<AdminPermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

