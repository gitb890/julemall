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

import com.junjie.jule.project.entity.BaseAttrValueEntity;
import com.junjie.jule.project.service.BaseAttrValueService;
import com.junjie.common.utils.R;



/**
 * 属性值表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@RestController
@RequestMapping("project/baseattrvalue")
public class BaseAttrValueController {
    @Autowired
    private BaseAttrValueService baseAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("project:baseattrvalue:info")
    public R info(@PathVariable("id") Long id){
		BaseAttrValueEntity baseAttrValue = baseAttrValueService.getById(id);

        return R.ok().put("baseAttrValue", baseAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseAttrValueEntity baseAttrValue){
		baseAttrValueService.save(baseAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseAttrValueEntity baseAttrValue){
		baseAttrValueService.updateById(baseAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		baseAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
