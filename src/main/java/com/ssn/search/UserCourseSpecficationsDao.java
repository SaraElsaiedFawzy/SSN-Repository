package com.ssn.search;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ssn.common.UserCourse;

public interface UserCourseSpecficationsDao extends JpaRepository<UserCourse, Long>,JpaSpecificationExecutor<UserCourse>  {
 
}
