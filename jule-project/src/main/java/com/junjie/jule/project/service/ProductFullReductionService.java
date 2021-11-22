package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.ProductFullReductionEntity;

import java.util.Map;

/**
 * 产品满减表(只针对同商品)
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface ProductFullReductionService extends IService<ProductFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

