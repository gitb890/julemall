package com.junjie.jule.project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.BaseCatalog2Dao;
import com.junjie.jule.project.entity.BaseCatalog2Entity;
import com.junjie.jule.project.service.BaseCatalog2Service;


@Service("baseCatalog2Service")
public class BaseCatalog2ServiceImpl extends ServiceImpl<BaseCatalog2Dao, BaseCatalog2Entity> implements BaseCatalog2Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseCatalog2Entity> page = this.page(
                new Query<BaseCatalog2Entity>().getPage(params),
                new QueryWrapper<BaseCatalog2Entity>()
        );

        return new PageUtils(page);
    }

}