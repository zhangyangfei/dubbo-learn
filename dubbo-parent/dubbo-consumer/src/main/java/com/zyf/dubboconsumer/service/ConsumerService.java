package com.zyf.dubboconsumer.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import com.zyf.dubbointerf.service.ApiService;

@Service // spring的servcie注解
public class ConsumerService {

	@Reference // apache dubbo的@Reference注解，注入服务接口实例
	private ApiService apiService;

	public String sayHello(String name) {
		return apiService.sayHello(name);
	}
}
