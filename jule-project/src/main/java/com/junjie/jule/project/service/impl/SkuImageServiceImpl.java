package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.SkuImageDao;
import com.junjie.jule.project.entity.SkuImageEntity;
import com.junjie.jule.project.service.SkuImageService;


@Service("skuImageService")
public class SkuImageServiceImpl extends ServiceImpl<SkuImageDao, SkuImageEntity> implements SkuImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImageEntity> page = this.page(
                new Query<SkuImageEntity>().getPage(params),
                new QueryWrapper<SkuImageEntity>()
        );

        return new PageUtils(page);
    }

}