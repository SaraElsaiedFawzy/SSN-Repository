package com.ssn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssn.common.City;
import com.ssn.common.UserOnlineCourses;


public interface UserOnlineCoursesDao extends JpaRepository<UserOnlineCourses, Long> {

}
