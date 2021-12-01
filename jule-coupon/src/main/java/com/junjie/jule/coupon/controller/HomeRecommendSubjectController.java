package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.HomeRecommendSubjectEntity;
import com.junjie.jule.coupon.service.HomeRecommendSubjectService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 首页推荐专题表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/homerecommendsubject")
public class HomeRecommendSubjectController {
    @Autowired
    private HomeRecommendSubjectService homeRecommendSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeRecommendSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeRecommendSubjectEntity homeRecommendSubject = homeRecommendSubjectService.getById(id);

        return R.ok().put("homeRecommendSubject", homeRecommendSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeRecommendSubjectEntity homeRecommendSubject){
		homeRecommendSubjectService.save(homeRecommendSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeRecommendSubjectEntity homeRecommendSubject){
		homeRecommendSubjectService.updateById(homeRecommendSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeRecommendSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
