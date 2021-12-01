package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.CouponProductCategoryRelationEntity;
import com.junjie.jule.coupon.service.CouponProductCategoryRelationService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 优惠券和产品分类关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/couponproductcategoryrelation")
public class CouponProductCategoryRelationController {
    @Autowired
    private CouponProductCategoryRelationService couponProductCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponProductCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponProductCategoryRelationEntity couponProductCategoryRelation = couponProductCategoryRelationService.getById(id);

        return R.ok().put("couponProductCategoryRelation", couponProductCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponProductCategoryRelationEntity couponProductCategoryRelation){
		couponProductCategoryRelationService.save(couponProductCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponProductCategoryRelationEntity couponProductCategoryRelation){
		couponProductCategoryRelationService.updateById(couponProductCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
