package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.project.entity.ProductVertifyRecordEntity;

import java.util.Map;

/**
 * 商品审核记录
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface ProductVertifyRecordService extends IService<ProductVertifyRecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

