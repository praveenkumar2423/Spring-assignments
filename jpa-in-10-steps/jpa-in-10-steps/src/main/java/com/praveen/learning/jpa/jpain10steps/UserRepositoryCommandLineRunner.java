package com.praveen.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.praveen.learning.jpa.jpain10steps.entity.User;

import com.praveen.learning.jpa.jpain10steps.service.UserRepository;

public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args0) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("kk", "Admin");
		
		 userRepository.save(user);
		log.info("New User is created : " + user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is Repository : " + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info(" All Users  : " + users);
		
		
	
	
	}

}