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
 * @date 2021-11-10 00:01:09
 */
@Data
@TableName("pms_base_sale_attr")
public class BaseSaleAttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 销售属性名称
	 */
	private String name;

}
