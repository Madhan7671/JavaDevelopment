package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	@Autowired
	private final EmployeeRepository employeerepo;
	public List<Employee> getAllEmployees()
	{
		return (employeerepo.findAll());
	}
	public Employee addEmp(Employee emp)
	{
		return(employeerepo.save(emp));
	}
	public void deleteEmp(Long empid)
	{
		employeerepo.deleteById(empid);
	}
	void updateEmployee(Employee emp) {
		Employee e1=employeerepo.findById(emp.getEmpId()).orElseThrow(()->new RuntimeException("Employee Not found"));
		e1.setName(emp.getName());
		e1.setLeaverequest(emp.getLeaverequest());
		e1.setJoining_date(emp.getJoining_date());
		e1.setEmpId(emp.getEmpId());
		e1.setEmail(emp.getEmail());
		e1.setDepartment(emp.getDepartment());
		employeerepo.save(e1);
	}
}
