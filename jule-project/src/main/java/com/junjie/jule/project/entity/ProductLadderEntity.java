package com.junjie.jule.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品阶梯价格表(只针对同商品)
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Data
@TableName("pms_product_ladder")
public class ProductLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long productId;
	/**
	 * 满足的商品数量
	 */
	private Integer count;
	/**
	 * 折扣
	 */
	private BigDecimal discount;
	/**
	 * 折后价格
	 */
	private BigDecimal price;

}
