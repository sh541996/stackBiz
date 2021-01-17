package com.stackMyBiz.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StackMyBizServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackMyBizServerApplication.class, args);
	}

}
