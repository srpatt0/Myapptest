package com.wf.interview.service;

import java.util.List;

import com.wf.interview.entity.User;

public interface UserService {
	
	public List<User> getAll();  
	public User getById(Long id);
	public User add(User user);
	public User update(User user);
	public User delete(Long id);
}
