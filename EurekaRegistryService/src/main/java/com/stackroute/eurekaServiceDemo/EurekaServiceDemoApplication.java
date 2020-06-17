package com.stackroute.eurekaServiceDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@EnableEurekaClient
@ComponentScan("com.stackroute.controller")
@SpringBootApplication
public class EurekaServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDemoApplication.class, args);
	}
}
