package com.junjie.jule.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.member.entity.MemberRuleSettingEntity;

import java.util.Map;

/**
 * 会员积分成长规则表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
public interface MemberRuleSettingService extends IService<MemberRuleSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

