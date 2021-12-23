package com.junjie.jule.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.member.entity.RolePermissionRelationEntity;
import com.junjie.jule.member.service.RolePermissionRelationService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 后台用户角色和权限关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
@RestController
@RequestMapping("member/rolepermissionrelation")
public class RolePermissionRelationController {
    @Autowired
    private RolePermissionRelationService rolePermissionRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = rolePermissionRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		RolePermissionRelationEntity rolePermissionRelation = rolePermissionRelationService.getById(id);

        return R.ok().put("rolePermissionRelation", rolePermissionRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.save(rolePermissionRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.updateById(rolePermissionRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		rolePermissionRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
