package com.ssn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssn.common.UserJobs;

public interface UserJobsDao extends JpaRepository<UserJobs, Long>{
	
//	UserJobs findByJobName(String jobName);
	List<UserJobs> findByJobName(String jobName);

}
