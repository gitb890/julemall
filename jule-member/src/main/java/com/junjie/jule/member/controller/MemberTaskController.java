package com.junjie.jule.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.member.entity.MemberTaskEntity;
import com.junjie.jule.member.service.MemberTaskService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 会员任务表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
@RestController
@RequestMapping("member/membertask")
public class MemberTaskController {
    @Autowired
    private MemberTaskService memberTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberTaskEntity memberTask = memberTaskService.getById(id);

        return R.ok().put("memberTask", memberTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.save(memberTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.updateById(memberTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
