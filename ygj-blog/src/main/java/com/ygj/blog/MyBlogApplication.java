package com.ygj.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 */
@SpringBootApplication
@MapperScan("com.ygj.blog.dao")
public class MyBlogApplication {

	public static void main(String[] args) {
		// 启动项目
		SpringApplication.run(MyBlogApplication.class, args);
	}

}
