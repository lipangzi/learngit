package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConterller {
	@RequestMapping("/")
	@ResponseBody
	public String test(){
		return "简单的负载均衡";
	}
	
	@RequestMapping("/hello")
	public String test1(){
		return "index";
	}
}
