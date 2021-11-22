package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.ProductLadderEntity;

import java.util.Map;

/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
public interface ProductLadderService extends IService<ProductLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

