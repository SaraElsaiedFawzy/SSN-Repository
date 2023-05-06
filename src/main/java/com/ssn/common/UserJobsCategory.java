package com.ssn.common;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_jobs_category")

public class UserJobsCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "catId")
	private List<UserJobs> userJobsCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userJobsCatId")
	private List<User> userCollection;

}
