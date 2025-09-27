package com.example.AmazonClone.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@GetMapping("/hi")
	public String getHello(){
		return "Hello";
	}
@GetMapping("/public")
public String get(){
	System.out.println("hello");
	return "Hello";
}
}
