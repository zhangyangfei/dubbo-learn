package com.zyf.dubbointerf.service;
/**
 * 定义dubbo api，单独打包，被提供者和消费者共通引用
 */
public interface ApiService {

	public String sayHello(String name);
}
