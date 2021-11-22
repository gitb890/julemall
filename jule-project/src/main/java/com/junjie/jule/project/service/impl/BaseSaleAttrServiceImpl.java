package com.junjie.jule.project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.BaseSaleAttrDao;
import com.junjie.jule.project.entity.BaseSaleAttrEntity;
import com.junjie.jule.project.service.BaseSaleAttrService;


@Service("baseSaleAttrService")
public class BaseSaleAttrServiceImpl extends ServiceImpl<BaseSaleAttrDao, BaseSaleAttrEntity> implements BaseSaleAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseSaleAttrEntity> page = this.page(
                new Query<BaseSaleAttrEntity>().getPage(params),
                new QueryWrapper<BaseSaleAttrEntity>()
        );

        return new PageUtils(page);
    }

}