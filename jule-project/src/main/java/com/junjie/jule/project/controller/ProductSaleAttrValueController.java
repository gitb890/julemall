package com.junjie.jule.project.controller;

import java.util.Arrays;
import java.util.Map;

import com.junjie.common.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.project.entity.ProductSaleAttrValueEntity;
import com.junjie.jule.project.service.ProductSaleAttrValueService;
import com.junjie.common.utils.R;



/**
 * spu销售属性值
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
@RestController
@RequestMapping("project/productsaleattrvalue")
public class ProductSaleAttrValueController {
    @Autowired
    private ProductSaleAttrValueService productSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productSaleAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductSaleAttrValueEntity productSaleAttrValue = productSaleAttrValueService.getById(id);

        return R.ok().put("productSaleAttrValue", productSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ProductSaleAttrValueEntity productSaleAttrValue){
		productSaleAttrValueService.save(productSaleAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ProductSaleAttrValueEntity productSaleAttrValue){
		productSaleAttrValueService.updateById(productSaleAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
