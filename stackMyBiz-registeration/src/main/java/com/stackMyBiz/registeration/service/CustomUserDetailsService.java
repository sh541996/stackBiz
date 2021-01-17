package com.stackMyBiz.registeration.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.stackMyBiz.registeration.model.RegisterDao;
import com.stackMyBiz.registeration.repository.RegisterationRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private RegisterationRepository registerationRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		RegisterDao user = registerationRepository.findByUserName(userName);
		
		if(user == null) throw new UsernameNotFoundException("username "+userName+" is not exist");
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	}

}




