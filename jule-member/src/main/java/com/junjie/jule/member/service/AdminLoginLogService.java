package com.junjie.jule.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.member.entity.AdminLoginLogEntity;

import java.util.Map;

/**
 * 后台用户登录日志表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
public interface AdminLoginLogService extends IService<AdminLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

