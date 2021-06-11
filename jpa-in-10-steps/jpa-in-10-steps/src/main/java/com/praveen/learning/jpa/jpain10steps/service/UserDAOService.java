package com.praveen.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.praveen.learning.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {
	/*
	 * User kumar = new User ("Kumar", "Admin");
	 * 
	 * User pk = new User("PK" , "Admin");
	 * 
	 * entitymanager.persist(kumar);
	 * 
	 * //Persistence Contex
	 * kumar.setRole("User");
	 * pk.setRole("User");
	 * 
	 * */

	@PersistenceContext
	private EntityManager entitymanager;
	
	public long insert(User user) {
		//Open Transaction
		entitymanager.persist(user);
		//Close Transaction
		return user.getId();
	}
	
	
	
	
}
