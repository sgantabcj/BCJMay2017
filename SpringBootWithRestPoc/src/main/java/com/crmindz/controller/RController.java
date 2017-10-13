package com.crmindz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RController {
	@ResponseBody
	@GetMapping("/msg")
	String helloMethod(){
		return "Hello World";
	}
}
