package com.ssn.dao;

import java.util.Optional;

import org.hibernate.usertype.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ssn.common.CourseType;


public interface CourseTypeDao extends JpaRepository<CourseType, Long> {
	Optional<CourseType> findByNameContaining(String courseType);

}
