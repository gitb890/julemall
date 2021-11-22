package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.BaseAttrValueEntity;

import java.util.Map;

/**
 * 属性值表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
public interface BaseAttrValueService extends IService<BaseAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

