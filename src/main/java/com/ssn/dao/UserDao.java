package com.ssn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ssn.common.User;
import com.ssn.common.UserJobsCategory;

public interface UserDao extends JpaRepository<User, Long> {
	@Query(nativeQuery = true,
			value="SELECT * FROM user as u join  course_bk  as bk on u.id = bk.user_id join user_course as uc  on bk.course_id = uc.ID join course_type as ct on ct.ID = uc.course_type_id  WHERE u.NEW_PASSWORD  = ?1 and u.USER_EMAIL_OR_PHONE = ?2")
	User findUserByNPassAndEmailOrPhone(String NEW_PASSWORD, String USER_EMAIL_OR_PHONE);
	
	

 
	
	
//	public static final String FIND_PROJECTS = "select  ct.name as courstype,uc.description,uc.name as courseName ,u.id from ssn.user_course as uc join ssn.course_type as ct  on uc.course_type_id = ct.id  join ssn.course_bk as cbk on cbk.course_id=uc.id  join ssn.user as u on u.id = cbk.user_id ";
//
//	@Query(nativeQuery = true,
//			 
//			value=" select  * from  user_course as uc \r\n"
//					+ "join ssn.course_type as ct \r\n"
//					+ "on uc.course_type_id = ct.id\r\n"
//					+ "join  course_bk as cbk\r\n"
//					+ "on cbk.course_id=uc.id\r\n"
//					+ "join  user as u\r\n"
//					+ "on u.id = cbk.user_id\r\n"
//					+ "and ct.name like %?1%")
//	User searchCourseName(String type );
	
	

	
	
	
//	Optional<User> findOneByNEW_PASSWORDAndUSER_EMAIL_OR_PHONE(String email, String password);
}
