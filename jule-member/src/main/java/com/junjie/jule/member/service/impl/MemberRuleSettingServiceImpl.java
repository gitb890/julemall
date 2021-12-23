package com.junjie.jule.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.member.dao.MemberRuleSettingDao;
import com.junjie.jule.member.entity.MemberRuleSettingEntity;
import com.junjie.jule.member.service.MemberRuleSettingService;


@Service("memberRuleSettingService")
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingDao, MemberRuleSettingEntity> implements MemberRuleSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberRuleSettingEntity> page = this.page(
                new Query<MemberRuleSettingEntity>().getPage(params),
                new QueryWrapper<MemberRuleSettingEntity>()
        );

        return new PageUtils(page);
    }

}