package com.junjie.jule.project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.BaseCatalog3Dao;
import com.junjie.jule.project.entity.BaseCatalog3Entity;
import com.junjie.jule.project.service.BaseCatalog3Service;


@Service("baseCatalog3Service")
public class BaseCatalog3ServiceImpl extends ServiceImpl<BaseCatalog3Dao, BaseCatalog3Entity> implements BaseCatalog3Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseCatalog3Entity> page = this.page(
                new Query<BaseCatalog3Entity>().getPage(params),
                new QueryWrapper<BaseCatalog3Entity>()
        );

        return new PageUtils(page);
    }

}