package com.wei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

	@RequestMapping("/")
	public String index(){
		return "Spring Boot 部署成功！";
	}
	
	@RequestMapping("test")
	public ModelAndView error(){
		return new ModelAndView("test");
	}
}
