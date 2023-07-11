package com.hellodocker.webproject.hellodock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloAppController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "index";
	}

}
