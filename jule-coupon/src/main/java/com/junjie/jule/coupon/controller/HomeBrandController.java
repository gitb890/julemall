package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.HomeBrandEntity;
import com.junjie.jule.coupon.service.HomeBrandService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 首页推荐品牌表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/homebrand")
public class HomeBrandController {
    @Autowired
    private HomeBrandService homeBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeBrandEntity homeBrand = homeBrandService.getById(id);

        return R.ok().put("homeBrand", homeBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeBrandEntity homeBrand){
		homeBrandService.save(homeBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeBrandEntity homeBrand){
		homeBrandService.updateById(homeBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeBrandService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
