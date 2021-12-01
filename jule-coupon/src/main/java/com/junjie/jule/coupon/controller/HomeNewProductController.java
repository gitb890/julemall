package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.HomeNewProductEntity;
import com.junjie.jule.coupon.service.HomeNewProductService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 新鲜好物表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/homenewproduct")
public class HomeNewProductController {
    @Autowired
    private HomeNewProductService homeNewProductService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeNewProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeNewProductEntity homeNewProduct = homeNewProductService.getById(id);

        return R.ok().put("homeNewProduct", homeNewProduct);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeNewProductEntity homeNewProduct){
		homeNewProductService.save(homeNewProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeNewProductEntity homeNewProduct){
		homeNewProductService.updateById(homeNewProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeNewProductService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
