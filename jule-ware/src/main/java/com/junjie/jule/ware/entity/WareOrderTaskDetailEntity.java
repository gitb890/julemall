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
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku名称
	 */
	private String skuName;
	/**
	 * 购买个数
	 */
	private Integer skuNums;
	/**
	 * 工作单编号
	 */
	private Long taskId;
	/**
	 * 
	 */
	private Integer skuNum;

}
