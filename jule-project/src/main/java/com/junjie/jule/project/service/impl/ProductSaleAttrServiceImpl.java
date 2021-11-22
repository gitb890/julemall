package com.junjie.jule.project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductSaleAttrDao;
import com.junjie.jule.project.entity.ProductSaleAttrEntity;
import com.junjie.jule.project.service.ProductSaleAttrService;


@Service("productSaleAttrService")
public class ProductSaleAttrServiceImpl extends ServiceImpl<ProductSaleAttrDao, ProductSaleAttrEntity> implements ProductSaleAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductSaleAttrEntity> page = this.page(
                new Query<ProductSaleAttrEntity>().getPage(params),
                new QueryWrapper<ProductSaleAttrEntity>()
        );

        return new PageUtils(page);
    }

}