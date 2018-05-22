package com.dwyanewang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.dwyanewang")
public class UserWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserWebApplication.class, args);
	}
}
