package com.junjie.jule.project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductInfoDao;
import com.junjie.jule.project.entity.ProductInfoEntity;
import com.junjie.jule.project.service.ProductInfoService;


@Service("productInfoService")
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoDao, ProductInfoEntity> implements ProductInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductInfoEntity> page = this.page(
                new Query<ProductInfoEntity>().getPage(params),
                new QueryWrapper<ProductInfoEntity>()
        );

        return new PageUtils(page);
    }

}