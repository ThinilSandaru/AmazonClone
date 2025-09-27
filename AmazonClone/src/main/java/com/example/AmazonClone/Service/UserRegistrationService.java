package com.example.AmazonClone.Service;


import com.example.AmazonClone.Model.User;
import com.example.AmazonClone.Model.UserRegistrationRequest;
import com.example.AmazonClone.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public User registerUser(UserRegistrationRequest request){

		if(userRepo.findByUsername(request.getUsername()).isPresent()){
			throw new RuntimeException("Username already exists.");
		}

		if(userRepo.findByEmail(request.getEmail()).isPresent()){
			throw new RuntimeException("Email already exists.");
		}

		User user=new User();
		user.setUsername(request.getUsername());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setFullName(request.getFullName());
		user.setRole(request.getRole());

		return userRepo.save(user);
	}




}
