package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.ProductSaleAttrValueEntity;

import java.util.Map;

/**
 * spu销售属性值
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface ProductSaleAttrValueService extends IService<ProductSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

