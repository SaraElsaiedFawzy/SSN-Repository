package com.ssn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssn.common.User;
import com.ssn.common.User2;

public interface User2Dao extends JpaRepository<User2, Long> {
//	@Query(nativeQuery = true,
//			value="select  * FROM user_data where user_data.courseType= :courseType ")
//	UserCourseView searchCourseName(String courseType);
	
//	UserCourseView findByCourseType(String courseType);
	
	@Query(nativeQuery = true,
			 
			value=" select  * from  user_course   join  course_type  on user_course.course_type_id = course_type.id join  course_bk  on course_bk.course_id=user_course.id join  user   on user.id = course_bk.user_id  and course_type.name like %?1%")
	User2 searchCourseName(String type );
	
	
 

}
