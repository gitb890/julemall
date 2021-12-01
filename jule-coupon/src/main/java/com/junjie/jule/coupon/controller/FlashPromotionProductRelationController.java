package com.junjie.jule.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junjie.jule.coupon.entity.FlashPromotionProductRelationEntity;
import com.junjie.jule.coupon.service.FlashPromotionProductRelationService;
import com.junjie.common.utils.PageUtils;
import com.junjie.common.utils.R;



/**
 * 商品限时购与商品关系表
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@RestController
@RequestMapping("coupon/flashpromotionproductrelation")
public class FlashPromotionProductRelationController {
    @Autowired
    private FlashPromotionProductRelationService flashPromotionProductRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		FlashPromotionProductRelationEntity flashPromotionProductRelation = flashPromotionProductRelationService.getById(id);

        return R.ok().put("flashPromotionProductRelation", flashPromotionProductRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.save(flashPromotionProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.updateById(flashPromotionProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
