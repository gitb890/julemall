package com.junjie.jule.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.member.dao.MemberMemberTagRelationDao;
import com.junjie.jule.member.entity.MemberMemberTagRelationEntity;
import com.junjie.jule.member.service.MemberMemberTagRelationService;


@Service("memberMemberTagRelationService")
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationDao, MemberMemberTagRelationEntity> implements MemberMemberTagRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberMemberTagRelationEntity> page = this.page(
                new Query<MemberMemberTagRelationEntity>().getPage(params),
                new QueryWrapper<MemberMemberTagRelationEntity>()
        );

        return new PageUtils(page);
    }

}