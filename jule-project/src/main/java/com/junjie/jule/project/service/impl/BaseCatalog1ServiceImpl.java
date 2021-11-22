package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.BaseCatalog1Dao;
import com.junjie.jule.project.entity.BaseCatalog1Entity;
import com.junjie.jule.project.service.BaseCatalog1Service;


@Service("baseCatalog1Service")
public class BaseCatalog1ServiceImpl extends ServiceImpl<BaseCatalog1Dao, BaseCatalog1Entity> implements BaseCatalog1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseCatalog1Entity> page = this.page(
                new Query<BaseCatalog1Entity>().getPage(params),
                new QueryWrapper<BaseCatalog1Entity>()
        );

        return new PageUtils(page);
    }

}