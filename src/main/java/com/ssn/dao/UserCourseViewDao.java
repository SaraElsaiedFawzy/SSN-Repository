package com.ssn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssn.common.UserCourseView;

public interface UserCourseViewDao extends JpaRepository<UserCourseView, Long> {
//	@Query(nativeQuery = true,
//			value="select  * FROM user_data where user_data.courseType= :courseType ")
//	UserCourseView searchCourseName(String courseType);
	
	UserCourseView findByCourseType(String courseType);
 

}
