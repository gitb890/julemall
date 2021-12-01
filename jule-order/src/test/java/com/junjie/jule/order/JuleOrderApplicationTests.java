package com.junjie.jule.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.junjie.jule.order.entity.OrderEntity;
import com.junjie.jule.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JuleOrderApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	void contextLoads() {
//		OrderEntity orderEntity = new OrderEntity();
		List<OrderEntity> list = orderService.list(new QueryWrapper<OrderEntity>().eq("id", 12));
		list.forEach((item)->{
			System.out.println(item);
		});
	}

}
