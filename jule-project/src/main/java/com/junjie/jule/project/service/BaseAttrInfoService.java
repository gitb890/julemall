package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.BaseAttrInfoEntity;

import java.util.Map;

/**
 * 属性表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
public interface BaseAttrInfoService extends IService<BaseAttrInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

