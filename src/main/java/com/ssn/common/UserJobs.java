package com.ssn.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Data
@Entity
@Table(name = "user_jobs")

public class UserJobs implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "JOB_NAME")
	private String jobName;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@Column(name = "COMPANY_LOCATION")
	private String companyLocation;
	@Column(name = "JOB_TITLE")
	private String jobTitle;
	@Column(name = "JOB_DESCRIPTION")
	private String jobDescription;
	@Column(name = "IS_TRAINIG")
	private boolean isTrainig;
	@Column(name = "IS_PERMENANT")
    private boolean isPermenant;
	@JoinColumn(name = "CAT_ID", referencedColumnName = "ID")
	@ManyToOne(optional = false)
	private UserJobsCategory catId;

}
