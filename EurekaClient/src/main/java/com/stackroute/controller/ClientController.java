package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Entity;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class ClientController {
	@Autowired
	private RestTemplateBuilder rtb;

	@Autowired
	private EurekaClient clnt;

	@RequestMapping("/")
	public String callServiceClass() {
		RestTemplate rst = rtb.build();
		InstanceInfo inst= clnt.getNextServerFromEureka("eurekaServiceDemo", false);
		String url = inst.getHomePageUrl();
		ResponseEntity<String> rsp = rst.exchange(url,HttpMethod.GET,null,String.class);
		return rsp.getBody();
	}
}
