package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.BaseAttrInfoDao;
import com.junjie.jule.project.entity.BaseAttrInfoEntity;
import com.junjie.jule.project.service.BaseAttrInfoService;


@Service("baseAttrInfoService")
public class BaseAttrInfoServiceImpl extends ServiceImpl<BaseAttrInfoDao, BaseAttrInfoEntity> implements BaseAttrInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseAttrInfoEntity> page = this.page(
                new Query<BaseAttrInfoEntity>().getPage(params),
                new QueryWrapper<BaseAttrInfoEntity>()
        );

        return new PageUtils(page);
    }

}