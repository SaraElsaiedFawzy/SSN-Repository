package com.ssn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssn.common.City;
import com.ssn.common.UserClass;


public interface UserClassDao extends JpaRepository<UserClass, Long> {

}
