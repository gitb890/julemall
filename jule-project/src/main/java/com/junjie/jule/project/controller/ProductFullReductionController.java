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

import com.junjie.jule.project.entity.ProductFullReductionEntity;
import com.junjie.jule.project.service.ProductFullReductionService;
import com.junjie.common.utils.R;



/**
 * 产品满减表(只针对同商品)
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
@RestController
@RequestMapping("project/productfullreduction")
public class ProductFullReductionController {
    @Autowired
    private ProductFullReductionService productFullReductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productFullReductionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ProductFullReductionEntity productFullReduction = productFullReductionService.getById(id);

        return R.ok().put("productFullReduction", productFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ProductFullReductionEntity productFullReduction){
		productFullReductionService.save(productFullReduction);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ProductFullReductionEntity productFullReduction){
		productFullReductionService.updateById(productFullReduction);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		productFullReductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
