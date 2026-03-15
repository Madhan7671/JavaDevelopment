package com.capgemini.com.Employee_Nest;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long EmpId;
	private String EmpName;
	private String Designation;
	private Double Salary;
	@ManyToOne
	@JoinColumn(name="DeptId")
	Department dept;
	public Employee(){
		
	}
	public Employee(String empName, String designation, Double salary, Department dept) {
		EmpName = empName;
		Designation = designation;
		Salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Designation=" + Designation + ", Salary="
				+ Salary + "]";
	}
	
}
