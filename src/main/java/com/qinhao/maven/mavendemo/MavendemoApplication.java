package com.qinhao.maven.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//启动类
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
public class MavendemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavendemoApplication.class, args);
	}
}
