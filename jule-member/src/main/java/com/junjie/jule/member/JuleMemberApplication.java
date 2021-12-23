package com.junjie.jule.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.需要远程调用其他事务
 * a.引入open-feign
 * b.编写一个远程接口，通过这个接口调用服务
 *  1).声明接口的每一个方法都是都用哪个远程服务的哪个请求
 * c.开启远程调用的功能
 * */
@MapperScan("com.junjie.jule.member.dao")
@EnableFeignClients(basePackages = "com.junjie.jule.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class JuleMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuleMemberApplication.class, args);
	}

}
