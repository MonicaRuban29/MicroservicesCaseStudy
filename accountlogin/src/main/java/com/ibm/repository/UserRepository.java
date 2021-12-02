package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> 
	{
	    User findByUserName(String username);
	
	
	}

