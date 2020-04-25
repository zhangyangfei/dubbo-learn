package com.zyf.dubboconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zyf.dubboconsumer.service.ConsumerService;

@RestController
@RequestMapping("/ConsumerController")
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;

	@RequestMapping("/sayHello")
	public String sayHello(String name) {
		return consumerService.sayHello(name);
	}
}
