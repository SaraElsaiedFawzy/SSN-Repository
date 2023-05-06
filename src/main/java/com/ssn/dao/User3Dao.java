package com.ssn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssn.common.User;

public interface User3Dao extends JpaRepository<User, Long> {
	
	@Query(nativeQuery = true,
			value="select * from ssn.user as u  join ssn.user_jobs as  j  on u.user_jobs_cat_id = j.id  join ssn.user_jobs_category as jc  on jc.id = j.cat_id   and j.job_name= ?1  ")
	List<User> searchJosAndTraninges(String job_name );

}
