package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductImageDao;
import com.junjie.jule.project.entity.ProductImageEntity;
import com.junjie.jule.project.service.ProductImageService;


@Service("productImageService")
public class ProductImageServiceImpl extends ServiceImpl<ProductImageDao, ProductImageEntity> implements ProductImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductImageEntity> page = this.page(
                new Query<ProductImageEntity>().getPage(params),
                new QueryWrapper<ProductImageEntity>()
        );

        return new PageUtils(page);
    }

}