package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {
	private EmployeeService employeeservice;
	@GetMapping
	public String getemployees(Model model){
		model.addAttribute("employees",employeeservice.getAllEmployees());
		return("EmployeeList");
	}
	@GetMapping("/new")
	public String showform(Model model)
	{
		model.addAttribute("employee",new Employee());
		return("employeeForm");
	}
	@PostMapping
	public String postemployee(@ModelAttribute Employee employee)
	{
		employeeservice.addEmp(employee);
		return("redirect:/employees");
	}
	@GetMapping("/delete/{id}")
	public String delteEmployeeById(@PathVariable Long id)
	{
		employeeservice.deleteEmp(id);
		return("redirect:/employees");
	}
}
