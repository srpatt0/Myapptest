package com.wf.interview.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.interview.entity.User;
import com.wf.interview.repository.UserRepository;
import com.wf.interview.service.UserService;

// @Component
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return this.repository.save(user);
		// this.repository.findByEmail(email)
		// this.repository.findByComplexRequirement(20, "dummy@mail.com");
		// this.repository.veryComplexBusinessLogicQuery("dummy@mail.com");
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return this.repository.save(user); // save & update
	}

	@Override
	public User delete(Long id) {
		// TODO Auto-generated method stub
		User user = this.getById(id);
		if(user != null)
			this.repository.deleteById(id);
		return user;
	}

}
