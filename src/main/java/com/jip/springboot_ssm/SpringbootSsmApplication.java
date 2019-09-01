package com.jip.springboot_ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement  开启事务管理
@MapperScan(value = "com.jip.springboot_ssm.dao")//扫描mapper包
public class SpringbootSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsmApplication.class, args);
	}
}
