package com.junjie.jule.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分消费设置
 * 
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
@Data
@TableName("ums_integration_consume_setting")
public class IntegrationConsumeSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 每一元需要抵扣的积分数量
	 */
	private Integer deductionPerAmount;
	/**
	 * 每笔订单最高抵用百分比
	 */
	private Integer maxPercentPerOrder;
	/**
	 * 每次使用积分最小单位100
	 */
	private Integer useUnit;
	/**
	 * 是否可以和优惠券同用；0->不可以；1->可以
	 */
	private Integer couponStatus;

}
