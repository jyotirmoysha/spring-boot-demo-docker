package com.springboot.demo.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class DemocController {
	
	@GetMapping("/hello1")
	public String sayHello() {
		return "Hello Jyotirmoy, Welcome to DevOps Testing with Docker";
	}

}
