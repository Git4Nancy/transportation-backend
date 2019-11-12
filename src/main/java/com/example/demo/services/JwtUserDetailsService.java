package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepo;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Login o=loginRepo.findByUserName(username);
		if(null !=o)
			return new User(o.getUserName(),new BCryptPasswordEncoder().encode(o.getPassword()),
					new ArrayList<>());
		 else 
			throw new UsernameNotFoundException("User not found with username: " + username);
	}

}