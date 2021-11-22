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

import com.junjie.jule.project.entity.BaseCatalog2Entity;
import com.junjie.jule.project.service.BaseCatalog2Service;
import com.junjie.common.utils.R;



/**
 * 
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@RestController
@RequestMapping("project/basecatalog2")
public class BaseCatalog2Controller {
    @Autowired
    private BaseCatalog2Service baseCatalog2Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseCatalog2Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		BaseCatalog2Entity baseCatalog2 = baseCatalog2Service.getById(id);

        return R.ok().put("baseCatalog2", baseCatalog2);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseCatalog2Entity baseCatalog2){
		baseCatalog2Service.save(baseCatalog2);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseCatalog2Entity baseCatalog2){
		baseCatalog2Service.updateById(baseCatalog2);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		baseCatalog2Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
