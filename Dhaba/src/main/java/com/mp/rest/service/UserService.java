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
	//private User user;
	
	public boolean userRegistraton(User user)
	{
		//boolean userRegistratedFlag = userRepo.save(user);
		 userRepo.save(user);
		return true;
	}
	
	public User getUser(String email){
		System.out.println("................ssss.........."+userRepo.findByEmail(email));
		User user = userRepo.findByEmail(email);
	//	System.out.print("///......................"+user);
		return user;
	}
	
	
	
}
