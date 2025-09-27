package com.example.AmazonClone.Service;

import com.example.AmazonClone.Model.MyUserDetails;
import com.example.AmazonClone.Model.User;
import com.example.AmazonClone.Repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MyUserDetailsService implements UserDetailsService {

private UserRepo userRepo;


public MyUserDetailsService(UserRepo userRepo){
	this.userRepo=userRepo;


}

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	System.out.println("hello");
	User user=userRepo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found"+username));


	return new MyUserDetails(user);
}
}
