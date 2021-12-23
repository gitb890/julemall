package com.junjie.jule.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@MapperScan("com.junjie.jule.coupon.dao")
@EnableFeignClients(basePackages = "com.junjie.jule.coupon.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class JuleCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuleCouponApplication.class, args);
	}

}
