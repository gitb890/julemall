package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.HomeAdvertiseDao;
import com.junjie.jule.coupon.entity.HomeAdvertiseEntity;
import com.junjie.jule.coupon.service.HomeAdvertiseService;


@Service("homeAdvertiseService")
public class HomeAdvertiseServiceImpl extends ServiceImpl<HomeAdvertiseDao, HomeAdvertiseEntity> implements HomeAdvertiseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvertiseEntity> page = this.page(
                new Query<HomeAdvertiseEntity>().getPage(params),
                new QueryWrapper<HomeAdvertiseEntity>()
        );

        return new PageUtils(page);
    }

}