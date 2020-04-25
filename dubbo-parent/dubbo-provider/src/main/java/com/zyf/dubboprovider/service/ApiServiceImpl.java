package com.zyf.dubboprovider.service;

import org.apache.dubbo.config.annotation.Service;
import com.zyf.dubbointerf.service.ApiService;

@Service // apache dubbo的servcie注解
public class ApiServiceImpl implements ApiService {
	@Override
	public String sayHello(String name) {
		System.out.println("来自服务提供者的问候：hello " + name);
		return "来自服务提供者的问候：hello " + name;
	}
}
