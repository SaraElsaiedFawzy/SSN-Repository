package com.ssn.dao;

import com.ssn.common.UserData;
import java.util.*;
public interface UserDataDao extends ReadOnlyRepository<UserData,Long> {
	
	 List<UserData> findByCourseType(String courseType);

}
