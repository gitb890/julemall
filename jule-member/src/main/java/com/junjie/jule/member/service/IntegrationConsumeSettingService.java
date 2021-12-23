package com.junjie.jule.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.member.entity.IntegrationConsumeSettingEntity;

import java.util.Map;

/**
 * 积分消费设置
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
public interface IntegrationConsumeSettingService extends IService<IntegrationConsumeSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

