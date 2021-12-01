package com.junjie.jule.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券和产品分类关系表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-01 17:47:30
 */
@Data
@TableName("sms_coupon_product_category_relation")
public class CouponProductCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long couponId;
	/**
	 * 
	 */
	private Long productCategoryId;
	/**
	 * 产品分类名称
	 */
	private String productCategoryName;
	/**
	 * 父分类名称
	 */
	private String parentCategoryName;

}
