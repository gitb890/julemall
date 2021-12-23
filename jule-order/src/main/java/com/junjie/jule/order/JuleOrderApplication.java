package com.junjie.jule.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.junjie.jule.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class JuleOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuleOrderApplication.class, args);
	}

}
