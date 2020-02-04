package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemoConroller {

	@GetMapping("/")
	public String s1() {
		
		System.out.println("test demo");
		
		return "anil well done ";
	}
}
