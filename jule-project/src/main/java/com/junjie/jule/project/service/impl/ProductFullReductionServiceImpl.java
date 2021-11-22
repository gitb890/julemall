package com.junjie.jule.project.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductFullReductionDao;
import com.junjie.jule.project.entity.ProductFullReductionEntity;
import com.junjie.jule.project.service.ProductFullReductionService;


@Service("productFullReductionService")
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionDao, ProductFullReductionEntity> implements ProductFullReductionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductFullReductionEntity> page = this.page(
                new Query<ProductFullReductionEntity>().getPage(params),
                new QueryWrapper<ProductFullReductionEntity>()
        );

        return new PageUtils(page);
    }

}