package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.HomeRecommendProductEntity;
import com.junjie.jule.coupon.service.HomeRecommendProductService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 人气推荐商品表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/homerecommendproduct")
public class HomeRecommendProductController {
    @Autowired
    private HomeRecommendProductService homeRecommendProductService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeRecommendProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeRecommendProductEntity homeRecommendProduct = homeRecommendProductService.getById(id);

        return R.ok().put("homeRecommendProduct", homeRecommendProduct);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.save(homeRecommendProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.updateById(homeRecommendProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeRecommendProductService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
