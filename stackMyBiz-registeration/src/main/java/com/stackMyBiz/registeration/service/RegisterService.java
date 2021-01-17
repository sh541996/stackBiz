package com.stackMyBiz.registeration.service;

import org.springframework.stereotype.Service;

import com.stackMyBiz.registeration.model.RegisterDao;
import com.stackMyBiz.registeration.model.UserDao;

@Service
public interface RegisterService {

	public String saveUser(UserDao user);

	public String verifyOtp(int otp);

	public RegisterDao getUserByUserName(String userName);

}
