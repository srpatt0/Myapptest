package com.wf.interview.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;

import com.wf.interview.dto.interviewDto;
import com.wf.interview.entity.Interview;
import com.wf.interview.entity.User;
import com.wf.interview.service.InterviewSerivce;

@Component
public class InterviewServiceImpl implements InterviewSerivce {

	@Override
	public List<Interview> getAllInterviews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview getInterview(String interviewName, String interviewerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllAttendees(Interview interview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getTotalInterviews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview addAttendee(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview updateInterview(Interview interview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview deleteInterview(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview getInterview(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public interviewDto saveInterview(@Valid interviewDto interviewDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
