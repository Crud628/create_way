package com.lan.mySecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecurityController {

	@RequestMapping("/hello")
	public String hello() {
		return "success";
	}
}
