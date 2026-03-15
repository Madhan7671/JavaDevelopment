package com.capgemini.com.Employee_Nest;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long DeptId;
	private String dept;
	private String location;
	@OneToMany(mappedBy ="dept",cascade=CascadeType.ALL)
	List<Employee> emp;
	public Department() {
		
	}
	public Department(String dept, String location) {
		this.dept = dept;
		this.location = location;
	}
	
}
