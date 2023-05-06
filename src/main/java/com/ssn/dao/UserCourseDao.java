package com.ssn.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssn.common.UserCourse;


public interface UserCourseDao extends JpaRepository<UserCourse, Long> {
 
	
	@Query(nativeQuery = true,
			value="select * from  user_course as uc join course_type as ct on uc.course_type_id = ct.id and uc.name like %?1% and ct.name like %?2%")
	UserCourse searchCourse(String courseName, String courseType);
	

	

 	Optional<UserCourse> findByNameContaining( String type);

}
