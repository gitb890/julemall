package com.junjie.jule.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.Query;

import com.junjie.jule.coupon.dao.HomeRecommendSubjectDao;
import com.junjie.jule.coupon.entity.HomeRecommendSubjectEntity;
import com.junjie.jule.coupon.service.HomeRecommendSubjectService;


@Service("homeRecommendSubjectService")
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectDao, HomeRecommendSubjectEntity> implements HomeRecommendSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeRecommendSubjectEntity> page = this.page(
                new Query<HomeRecommendSubjectEntity>().getPage(params),
                new QueryWrapper<HomeRecommendSubjectEntity>()
        );

        return new PageUtils(page);
    }

}