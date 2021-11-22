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

import com.junjie.jule.project.entity.BaseAttrInfoEntity;
import com.junjie.jule.project.service.BaseAttrInfoService;
import com.junjie.common.utils.R;



/**
 * 属性表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@RestController
@RequestMapping("project/baseattrinfo")
public class BaseAttrInfoController {
    @Autowired
    private BaseAttrInfoService baseAttrInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseAttrInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		BaseAttrInfoEntity baseAttrInfo = baseAttrInfoService.getById(id);

        return R.ok().put("baseAttrInfo", baseAttrInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaseAttrInfoEntity baseAttrInfo){
		baseAttrInfoService.save(baseAttrInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaseAttrInfoEntity baseAttrInfo){
		baseAttrInfoService.updateById(baseAttrInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		baseAttrInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
