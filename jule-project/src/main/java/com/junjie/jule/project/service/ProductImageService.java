package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.project.entity.ProductImageEntity;

import java.util.Map;

/**
 * 商品图片表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface ProductImageService extends IService<ProductImageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

