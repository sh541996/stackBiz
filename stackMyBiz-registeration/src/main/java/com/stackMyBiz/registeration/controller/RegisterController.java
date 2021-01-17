package com.stackMyBiz.registeration.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackMyBiz.registeration.model.UserDao;
import com.stackMyBiz.registeration.service.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> registerUser(@Valid @RequestBody UserDao user) {
		
		return ResponseEntity.ok(registerService.saveUser(user));
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> registerUser() {
		return ResponseEntity.ok("hello");
	}
	
	@GetMapping("/register/{otp}")
	public String verify(@PathVariable("otp") int otp) {
		return registerService.verifyOtp(otp);
	}
	

}
