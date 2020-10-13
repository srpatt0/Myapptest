package com.wf.interview.service;

import java.util.Date;
import java.util.List;

import com.wf.interview.entity.Interview;
import com.wf.interview.entity.User;

public interface InterviewSerivce {	
	
	public List<Interview> getAllInterviews();  //9
	public Interview getInterview(String interviewName, String interviewerName); //7
	public List<User> getAllAttendees(Interview interview);  //11
	public Integer getTotalInterviews();  //8	
	public Interview addAttendee(User user);  //10
	public Interview updateInterview(Interview interview);  //6
	public Interview deleteInterview(Long id);   //5
	public Interview getInterview(Long id);
	


}
