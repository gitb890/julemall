package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.FlashPromotionEntity;
import com.junjie.jule.coupon.service.FlashPromotionService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 限时购表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/flashpromotion")
public class FlashPromotionController {
    @Autowired
    private FlashPromotionService flashPromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		FlashPromotionEntity flashPromotion = flashPromotionService.getById(id);

        return R.ok().put("flashPromotion", flashPromotion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FlashPromotionEntity flashPromotion){
		flashPromotionService.save(flashPromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FlashPromotionEntity flashPromotion){
		flashPromotionService.updateById(flashPromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
