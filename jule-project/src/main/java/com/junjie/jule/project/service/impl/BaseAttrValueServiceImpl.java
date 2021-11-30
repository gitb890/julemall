package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.BaseAttrValueDao;
import com.junjie.jule.project.entity.BaseAttrValueEntity;
import com.junjie.jule.project.service.BaseAttrValueService;


@Service("baseAttrValueService")
public class BaseAttrValueServiceImpl extends ServiceImpl<BaseAttrValueDao, BaseAttrValueEntity> implements BaseAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseAttrValueEntity> page = this.page(
                new Query<BaseAttrValueEntity>().getPage(params),
                new QueryWrapper<BaseAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}