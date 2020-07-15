package com.zyf.dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo // 开启apache dubbo
public class DubboProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
		///测试
	}
}
