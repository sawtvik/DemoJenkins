package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoJenkinController {
	
	@GetMapping("/msg")
	
	public String show() {
		return "welcome to jenkin session";
	}
	

}
