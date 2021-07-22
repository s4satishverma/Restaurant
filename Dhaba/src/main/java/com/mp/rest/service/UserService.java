package com.mp.rest.service;

import org.hibernate.hql.internal.ast.tree.IsNotNullLogicOperatorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Service;

import com.mp.rest.model.User;
import com.mp.rest.repository.UserRepository;
import com.mp.rest.repository.UserRepositoryImpl;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public boolean userRegistraton(User user)
	{
		//boolean userRegistratedFlag = userRepo.save(user);
		 userRepo.save(user);
		return true;
	}
	
	
}
