package com.imooc.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MiaoshaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoshaApplication.class, args);
		System.out.println("启动springboot成功！");
	}
}
