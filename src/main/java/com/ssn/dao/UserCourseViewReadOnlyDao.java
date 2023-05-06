package com.ssn.dao;

import com.ssn.common.UserCourseView;

public interface UserCourseViewReadOnlyDao  extends ReadOnlyRepository<UserCourseView, Long>{
	UserCourseView findByCourseType(String type);

}
