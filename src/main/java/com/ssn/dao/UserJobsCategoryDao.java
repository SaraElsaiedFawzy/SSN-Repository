package com.ssn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssn.common.UserJobsCategory;

public interface UserJobsCategoryDao extends JpaRepository<UserJobsCategory, Long> {
	@Query(nativeQuery = true,
			value="select * from  user_jobs  as j join  user_jobs_category  as jc   on jc.id = j.cat_id and j.job_name= ?1")
	List<UserJobsCategory> searchJosAndTraninges(String job_name );

}
