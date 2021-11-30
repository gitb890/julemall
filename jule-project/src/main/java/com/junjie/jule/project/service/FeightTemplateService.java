package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.project.entity.FeightTemplateEntity;

import java.util.Map;

/**
 * 运费模版
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

