package com.ssn.common;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
 
//@Data
@Entity(name = "user_data")
@Immutable
//@Table(name = "user_data")
//@NamedQueries({
//    @NamedQuery(name = "UserData.findAll", query = "SELECT u FROM UserData u"),
//    @NamedQuery(name = "UserData.findById", query = "SELECT u FROM UserData u WHERE u.id = :id"),
//    @NamedQuery(name = "UserData.findByFirstName", query = "SELECT u FROM UserData u WHERE u.firstName = :firstName"),
//    @NamedQuery(name = "UserData.findBySecondName", query = "SELECT u FROM UserData u WHERE u.secondName = :secondName"),
//    @NamedQuery(name = "UserData.findByCourseType", query = "SELECT u FROM UserData u WHERE u.courseType = :courseType"),
//    @NamedQuery(name = "UserData.findByCourseName", query = "SELECT u FROM UserData u WHERE u.courseName = :courseName")})
public class UserData implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "secondName")
    private String secondName;
    @Column(name = "courseType")
    private String courseType;
    @Column(name = "courseName")
    private String courseName;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
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
