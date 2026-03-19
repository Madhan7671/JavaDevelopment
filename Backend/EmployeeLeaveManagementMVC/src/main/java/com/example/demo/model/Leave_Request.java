package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Leave_Request {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long request_id;
	@ManyToOne
	@JoinColumn(name="employee_id")
	Employee employee;
	@ManyToOne
	@JoinColumn(name="leave_type_id")
	Leave_Type leavetype;
	private String start_date;
	private String end_date;
	private String status;
	
}
