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

import com.junjie.jule.project.entity.BaseCatalog3Entity;
import com.junjie.jule.project.service.BaseCatalog3Service;
import com.junjie.common.utils.R;



/**
 * 
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@RestController
@RequestMapping("project/basecatalog3")
public class BaseCatalog3Controller {
    @Autowired
    private BaseCatalog3Service baseCatalog3Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseCatalog3Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		BaseCatalog3Entity baseCatalog3 = baseCatalog3Service.getById(id);

        return R.ok().put("baseCatalog3", baseCatalog3);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseCatalog3Entity baseCatalog3){
		baseCatalog3Service.save(baseCatalog3);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseCatalog3Entity baseCatalog3){
		baseCatalog3Service.updateById(baseCatalog3);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		baseCatalog3Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
