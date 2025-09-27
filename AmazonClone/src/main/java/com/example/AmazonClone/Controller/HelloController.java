package com.example.AmazonClone.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/customer/hello")
	public String getHello(){
		return "Hello ";
	}

}
