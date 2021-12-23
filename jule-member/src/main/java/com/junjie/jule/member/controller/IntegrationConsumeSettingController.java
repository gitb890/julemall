package com.junjie.jule.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.member.entity.IntegrationConsumeSettingEntity;
import com.junjie.jule.member.service.IntegrationConsumeSettingService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 积分消费设置
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
@RestController
@RequestMapping("member/integrationconsumesetting")
public class IntegrationConsumeSettingController {
    @Autowired
    private IntegrationConsumeSettingService integrationConsumeSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = integrationConsumeSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		IntegrationConsumeSettingEntity integrationConsumeSetting = integrationConsumeSettingService.getById(id);

        return R.ok().put("integrationConsumeSetting", integrationConsumeSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.save(integrationConsumeSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.updateById(integrationConsumeSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		integrationConsumeSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
