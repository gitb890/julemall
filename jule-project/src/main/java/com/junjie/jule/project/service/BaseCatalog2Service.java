package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.BaseCatalog2Entity;

import java.util.Map;

/**
 * 
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
public interface BaseCatalog2Service extends IService<BaseCatalog2Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

