package com.junjie.jule.ware.entity;

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
 * @date 2021-12-06 16:14:13
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * skuid
	 */
	private Long skuId;
	/**
	 * 仓库id
	 */
	private Long warehouseId;
	/**
	 * 库存数
	 */
	private Integer stock;
	/**
	 * 存货名称
	 */
	private String stockName;
	/**
	 * 
	 */
	private Integer stockLocked;

}
