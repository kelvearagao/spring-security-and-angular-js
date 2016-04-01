package com.site;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityAndAngularJsApplication {
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping("/resource")
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("id", "123");
		model.put("content", "Hello World");
		
		return model;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAndAngularJsApplication.class, args);
	}
}
