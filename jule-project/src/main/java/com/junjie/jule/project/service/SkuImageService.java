package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.SkuImageEntity;

import java.util.Map;

/**
 * 库存单元图片表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
public interface SkuImageService extends IService<SkuImageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

