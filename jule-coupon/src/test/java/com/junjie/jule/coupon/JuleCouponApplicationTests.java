package com.junjie.jule.coupon;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.junjie.jule.coupon.entity.CouponEntity;
import com.junjie.jule.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JuleCouponApplicationTests {

	@Autowired
	CouponService couponService;

	@Test
	void contextLoads() {
		CouponEntity couponEntity = new CouponEntity();
//		couponEntity.setId(23L);
//		couponService.save(couponEntity);
//		System.out.println();
		List<CouponEntity> list = couponService.list(new QueryWrapper<CouponEntity>().eq("id", 22L));
		list.forEach((item)->{
			System.out.println(item);
		});

	}

}
