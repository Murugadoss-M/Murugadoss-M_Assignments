package com.mmdoss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController{
	
	@RequestMapping("/index")
	public String init() {
		return "index";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "helloWorld";
	}
	
}