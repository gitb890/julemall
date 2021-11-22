package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.ProductOperateLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface ProductOperateLogService extends IService<ProductOperateLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

