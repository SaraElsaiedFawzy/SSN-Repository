package com.ssn.common;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

//@Data // to generate setter, getter methods and constrcutor
@Entity
@Immutable
//@Table(name ="user_data")//
@Subselect("select  row_number() OVER(ORDER BY ct.name  DESC) AS id,\r\n"
		+ "u.USER_FIRST_NAME as firstName , u.USER_LAST_NAME as secondName , ct.name as course_type \r\n"
		+ ",uc.name as courseName\r\n"
		+ "from ssn.user_course as uc \r\n"
		+ "join  course_type as ct \r\n"
		+ "on uc.course_type_id = ct.id\r\n"
		+ "join  course_bk as cbk\r\n"
		+ "on cbk.course_id=uc.id\r\n"
		+ "join  user as u\r\n"
		+ "on u.id = cbk.user_id")
 public class UserCourseView {
	@Id
//	@Column(name = "id")
    private Long id;
//	@Column(name = "first_name")
	private String firstName;
//	@Column(name = "second_name")
	private String secondName;
//	@Column(name = "course_type")
	private String courseType;
//	@Column(name = "course_name")
	private String courseName;
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getCourseType() {
		return courseType;
	}
	public String getCourseName() {
		return courseName;
	}
	
	
	
	

}
