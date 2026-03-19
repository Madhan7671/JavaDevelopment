package com.example.demo.model;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empId;
	private String name;
	private String email;
	private String department;
	private String joining_date;
	@OneToMany(mappedBy = "employee", cascade=CascadeType.ALL)
	List<Leave_Request>leaverequest;
	
	
}
