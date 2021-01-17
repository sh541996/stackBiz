package com.stackMyBiz.registeration.service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.stackMyBiz.registeration.model.RegisterDao;
import com.stackMyBiz.registeration.model.UserDao;
import com.stackMyBiz.registeration.repository.RegisterationRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired 
	RegisterationRepository registerRepository;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	static RegisterDao newUser = new RegisterDao();
	Random random = new Random();
	static int rand ;
	
	
	@Override
	public String saveUser(UserDao user) {
		
		newUser.setMobile((user.getContact()));
		newUser.setName(user.getName());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setUserName(user.getUserName());	
		newUser.setAddress(user.getAddress());
		newUser.setMailId(user.getMailId());
		
		Date dob = Date.valueOf(user.getDob());
		newUser.setDob(dob);
		
		rand = random.nextInt(1000000);
		try {
		URL url = new URL("https://2factor.in/API/V1/a33536c3-572b-11eb-8153-0200cd936042/SMS/"+user.getContact()+"/"+rand);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        if(con.getResponseCode() == 200) return "please verify your mobile number";
        
        
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		
		return "try again";
	}


	@Override
	public String verifyOtp(int otp) {
		
		if(rand == otp) {
			registerRepository.save(newUser);
			return "otp is verified successfully";
		}
		
		return "otp is not verified try again";
		
	}


	@Override
	public RegisterDao getUserByUserName(String userName) {
		
		return registerRepository.findByUserName(userName);
	}

}
