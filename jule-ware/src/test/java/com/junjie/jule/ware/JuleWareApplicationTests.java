package com.junjie.jule.ware;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.junjie.jule.ware.entity.WareInfoEntity;
import com.junjie.jule.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JuleWareApplicationTests {

	@Autowired
	WareInfoService wareInfoService;

	@Test
	void contextLoads() {
		List<WareInfoEntity> list = wareInfoService.list(new QueryWrapper<WareInfoEntity>().eq("id", 1L));
		list.forEach((item)->{
			System.out.println(item);
		});
	}

}
