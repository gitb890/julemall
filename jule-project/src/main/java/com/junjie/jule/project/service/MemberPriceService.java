package com.junjie.jule.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.jule.project.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

