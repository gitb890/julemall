package com.junjie.jule.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品满减表(只针对同商品)
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
@Data
@TableName("pms_product_full_reduction")
public class ProductFullReductionEntity implements Serializable {
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
	 * 
	 */
	private BigDecimal fullPrice;
	/**
	 * 
	 */
	private BigDecimal reducePrice;

}
