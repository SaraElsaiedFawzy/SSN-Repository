package com.ssn.common;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Data // to generate setter, getter methods and constrcutor
@Entity
@Table(name = "user_course")
public class UserCourse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;  
	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToMany(mappedBy = "userCourse")
	List<User> userCourse;
	@ToString.Exclude

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_type_id",referencedColumnName = "ID",nullable=false)
 	private CourseType userType;
  
}
