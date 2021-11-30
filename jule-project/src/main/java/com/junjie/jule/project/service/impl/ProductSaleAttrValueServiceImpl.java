package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductSaleAttrValueDao;
import com.junjie.jule.project.entity.ProductSaleAttrValueEntity;
import com.junjie.jule.project.service.ProductSaleAttrValueService;


@Service("productSaleAttrValueService")
public class ProductSaleAttrValueServiceImpl extends ServiceImpl<ProductSaleAttrValueDao, ProductSaleAttrValueEntity> implements ProductSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductSaleAttrValueEntity> page = this.page(
                new Query<ProductSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}