package com.junjie.jule.project;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.junjie.jule.project.entity.BrandEntity;
import com.junjie.jule.project.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JuleProjectApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		测试添加一条数据
//		brandEntity.setId(53L);
//		brandEntity.setName("苹果x");
//		brandService.updateById(brandEntity);
//		测试修改一条数据
//		System.out.println("save success!");

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("id", 2l));
		list.forEach((item)->{
			System.out.println(item);
				});
	}

}
