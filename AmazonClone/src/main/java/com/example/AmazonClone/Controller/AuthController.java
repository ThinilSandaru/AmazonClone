package com.example.AmazonClone.Controller;


import com.example.AmazonClone.Model.UserRegistrationRequest;
import com.example.AmazonClone.Service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@Autowired
	private UserRegistrationService userRegistrationService;


	@PostMapping("/public/register")
	public ResponseEntity<String> register(@RequestBody UserRegistrationRequest request){
		System.out.println("Helloworld");
		try{
			userRegistrationService.registerUser(request);
			return ResponseEntity.ok("Successfully registered");

		}
		catch (RuntimeException e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}


	}

}
