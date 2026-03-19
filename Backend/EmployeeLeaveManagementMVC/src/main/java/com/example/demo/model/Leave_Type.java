package com.example.demo.model;

import jakarta.persistence.Entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class Leave_Type {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long leave_type_id;
	private String leave_name;
	private int max_days_allowed;
	@OneToMany(mappedBy = "leavetype",cascade=CascadeType.ALL)
	List<Leave_Request> leaverequest;
	
}
