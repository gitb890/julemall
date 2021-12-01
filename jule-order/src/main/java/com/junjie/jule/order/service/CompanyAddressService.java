package com.junjie.jule.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.order.entity.CompanyAddressEntity;

import java.util.Map;

/**
 * 公司收发货地址表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 16:53:37
 */
public interface CompanyAddressService extends IService<CompanyAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

