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

import com.junjie.jule.project.entity.BaseCatalog1Entity;
import com.junjie.jule.project.service.BaseCatalog1Service;
import com.junjie.common.utils.R;



/**
 * 一级分类表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@RestController
@RequestMapping("project/basecatalog1")
public class BaseCatalog1Controller {
    @Autowired
    private BaseCatalog1Service baseCatalog1Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseCatalog1Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		BaseCatalog1Entity baseCatalog1 = baseCatalog1Service.getById(id);

        return R.ok().put("baseCatalog1", baseCatalog1);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseCatalog1Entity baseCatalog1){
		baseCatalog1Service.save(baseCatalog1);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseCatalog1Entity baseCatalog1){
		baseCatalog1Service.updateById(baseCatalog1);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		baseCatalog1Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
