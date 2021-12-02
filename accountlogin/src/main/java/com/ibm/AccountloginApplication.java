package com.ibm;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.ibm.repository.UserRepository;
import com.ibm.entity.User;

@SpringBootApplication
public class AccountloginApplication {
	 
	@Autowired
	    private UserRepository repository;

		
		/*
		 * @PostConstruct//start the method on application startup public void
		 * initUsers() { List<User> users = Stream.of( new User(101, "user1", "pwd1"),
		 * new User(102, "user2", "pwd2"), new User(103, "user3", "pwd3")
		 * ).collect(Collectors.toList());
		 * 
		 * repository.saveAll(users); }
		 */
		 
	
	public static void main(String[] args) {
		SpringApplication.run(AccountloginApplication.class, args);
	}

	@Bean
	public RestTemplate gettemplate()
	{
		return new RestTemplate();
	}
	
}
