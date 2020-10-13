package com.wf.interview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity 
public class User {	
	
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private Long userId;
	private String firstName;
	private String lastName;	
	private String email;	
	private Integer mobile;
}
