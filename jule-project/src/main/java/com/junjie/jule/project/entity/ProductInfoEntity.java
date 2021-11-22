package com.junjie.jule.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Data
@TableName("pms_product_info")
public class ProductInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Long id;
	/**
	 * 商品名称
	 */
	private String productName;
	/**
	 * 商品描述(后台简述）
	 */
	private String description;
	/**
	 * 三级分类id
	 */
	private Long catalog3Id;
	/**
	 * 品牌id
	 */
	private Long tmId;

}
