package com.junjie.jule.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1.整合mybatis-plus
 *   1)导入依赖
 *   2)配置
 *    1、配置数据源；
 *       导入数据库的驱动
 *    2、配置mybatis-plus
 *        a.使用MapperScan找到映射文件接口
 *        b.给mybatis-plus,sql映射文件的位置
 * */

@MapperScan("com.junjie.jule.project.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class JuleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuleProjectApplication.class, args);
	}

}
