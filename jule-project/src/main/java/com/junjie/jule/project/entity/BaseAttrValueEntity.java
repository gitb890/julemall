package com.junjie.jule.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性值表
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-11-10 00:01:08
 */
@Data
@TableName("pms_base_attr_value")
public class BaseAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 属性值名称
	 */
	private String valueName;
	/**
	 * 属性id
	 */
	private Long attrId;
	/**
	 * 启用：1 停用：0 1
	 */
	private String isEnabled;

}
