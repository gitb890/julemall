package com.junjie.jule.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Data
@TableName("pms_base_attr_info")
public class BaseAttrInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 属性名称
	 */
	private String attrName;
	/**
	 * 
	 */
	private Long catalog3Id;
	/**
	 * 启用：1 停用：0
	 */
	private String isEnabled;

}
