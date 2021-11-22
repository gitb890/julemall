package com.junjie.jule.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu销售属性值
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:09
 */
@Data
@TableName("pms_product_sale_attr_value")
public class ProductSaleAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long productId;
	/**
	 * 销售属性id
	 */
	private Long saleAttrId;
	/**
	 * 销售属性值名称
	 */
	private String saleAttrValueName;

}
