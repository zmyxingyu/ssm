package com.baiyun.test;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hello")
public class HelloControler {

	String message = "Welcome to Spring MVC!";
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(Model model) throws Exception {
	
		// 类似于 request.setAttribute()
		model.addAttribute("name", "张三");
		model.addAttribute("message", message);
		System.out.println(message);
		return "index";
	}
}
