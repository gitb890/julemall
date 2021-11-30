package com.junjie.jule.project.service.impl;

import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.junjie.jule.project.dao.ProductOperateLogDao;
import com.junjie.jule.project.entity.ProductOperateLogEntity;
import com.junjie.jule.project.service.ProductOperateLogService;


@Service("productOperateLogService")
public class ProductOperateLogServiceImpl extends ServiceImpl<ProductOperateLogDao, ProductOperateLogEntity> implements ProductOperateLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductOperateLogEntity> page = this.page(
                new Query<ProductOperateLogEntity>().getPage(params),
                new QueryWrapper<ProductOperateLogEntity>()
        );

        return new PageUtils(page);
    }

}