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

import com.junjie.jule.project.entity.BaseSaleAttrEntity;
import com.junjie.jule.project.service.BaseSaleAttrService;
import com.junjie.common.utils.R;



/**
 * 
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
@RestController
@RequestMapping("project/basesaleattr")
public class BaseSaleAttrController {
    @Autowired
    private BaseSaleAttrService baseSaleAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseSaleAttrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		BaseSaleAttrEntity baseSaleAttr = baseSaleAttrService.getById(id);

        return R.ok().put("baseSaleAttr", baseSaleAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseSaleAttrEntity baseSaleAttr){
		baseSaleAttrService.save(baseSaleAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseSaleAttrEntity baseSaleAttr){
		baseSaleAttrService.updateById(baseSaleAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		baseSaleAttrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
