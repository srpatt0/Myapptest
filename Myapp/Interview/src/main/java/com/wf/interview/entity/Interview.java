package com.wf.interview.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter
@NoArgsConstructor
// @AllArgsConstructor
//@ToString
@Data
@Entity // auto map class with table student in db
// @Table(name = "studentmaster") // mapped with table studentmaster in db
public class Interview {
	// all fields will map to col in table
	
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private Long interviewId;
	private String interviewName;
	private String interviewerName;	
	private String usersSkills;	
	private Date interviewDate;	
	private String interviewTime;
	private String interviewStatus;
	private String interviewRemarks;
	
}
