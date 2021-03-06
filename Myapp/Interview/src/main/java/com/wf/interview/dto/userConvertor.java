package com.wf.interview.dto;

import com.wf.apps.interviewApp.entity.user;
import com.wf.interview.entity.User;

public class userConvertor {
	
	public static User userDtoToUserConverted(userDto userDto)
	{
		User user=new User();
		user.setEmail(userDto.getEmail());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setMobile(userDto.getMobile());
		return user;
	}
	
	public static userDto userToUserDtoConverter(user user)
	{
		userDto userDto=new userDto();
		userDto.setUserId(user.getUserid());
		userDto.setEmail(user.getEmail());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setMobile(user.getMobile());
		
		return userDto;
	}

}
