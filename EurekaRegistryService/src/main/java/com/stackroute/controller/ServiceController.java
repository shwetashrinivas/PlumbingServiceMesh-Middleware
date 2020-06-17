package com.stackroute.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping("/")
	public String HelloWorld() {
		return "Hello from Eureka Service";
	}
}
