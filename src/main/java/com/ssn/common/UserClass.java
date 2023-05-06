package com.ssn.common;

import java.util.List;

import javax.persistence.*;
 
import lombok.*;

@Data // to generate setter, getter methods and constrcutor
@Entity
@Table(name = "user_class")
public class UserClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	
	@ManyToMany(mappedBy = "userClass")
	List<User> userClass;

}
