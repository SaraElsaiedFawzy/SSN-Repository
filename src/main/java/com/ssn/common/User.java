package com.ssn.common;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data // to generate setter, getter methods and constrcutor
@Entity
@Table(name = "user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "USER_FIRST_NAME")
	private String fName;
	@Column(name = "USER_LAST_NAME")
	private String lName;
	@Column(name = "USER_EMAIL_OR_PHONE")
	private String emailOrPhone;
	@Column(name = "NEW_PASSWORD")
	private String nPass;
	@Column(name = "CONFIRM_PASSWORD")
	private String cPass;
	@Column(name = "USER_GENDER")
	private String gender;
//	@ToString.Exclude
//	@JoinColumn(name = "CITY_ID", referencedColumnName = "ID")
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private City city;
	@OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
	// ,cascade = CascadeType.ALL)
//	@ToString.Exclude
	// @JsonBackReference
//	@JsonManagedReference
	private Set<CVBuilder> user_id;

	@ManyToMany
	@ToString.Exclude
	@JoinTable(name = "course_bk", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "ID"))
	List<UserCourse> userCourse;

	@ManyToMany
	@ToString.Exclude
	@JoinTable(name = "class_bk", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "class_id", referencedColumnName = "ID"))
	List<UserClass> userClass;

	@ManyToMany
	@ToString.Exclude
	@JoinTable(name = "skills_bk", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "ID"))
	List<UserSkills> userSkills;

	@ManyToMany
	@ToString.Exclude
	@JoinTable(name = "online_bk", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "online_id", referencedColumnName = "ID"))
	List<UserOnlineCourses> onlineCourse;

	@JoinColumn(name = "USER_JOBS_CAT_ID", referencedColumnName = "ID")
	@ManyToOne(optional = false)
	private UserJobsCategory userJobsCatId;

}
