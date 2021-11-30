package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductLadderDao;
import com.junjie.jule.project.entity.ProductLadderEntity;
import com.junjie.jule.project.service.ProductLadderService;


@Service("productLadderService")
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderDao, ProductLadderEntity> implements ProductLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductLadderEntity> page = this.page(
                new Query<ProductLadderEntity>().getPage(params),
                new QueryWrapper<ProductLadderEntity>()
        );

        return new PageUtils(page);
    }

}