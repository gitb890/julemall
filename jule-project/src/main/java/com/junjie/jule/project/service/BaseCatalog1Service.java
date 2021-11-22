package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.BaseCatalog1Entity;

import java.util.Map;

/**
 * 一级分类表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
public interface BaseCatalog1Service extends IService<BaseCatalog1Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

