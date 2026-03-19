package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Leave_Type;
import com.example.demo.service.LeaveTypeService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RestController("/LeaveType")
public class LeaveType {
	private LeaveTypeService service;
	@GetMapping
	public String getLeaveList(Model model)
	{
		model.addAttribute("LeaveType",service.getAlltheTypes());
		return("LeaveTypes");
	}
	@GetMapping("/New")
	public String showform(Model model)
	{
		model.addAttribute("LeaveType",new Leave_Type());
		return("leaveTypeform");
	}
	@PostMapping
	public String postLeaveType(@ModelAttribute Leave_Type leavetype)
	{
		service.addleave(leavetype);
		return("redirect://LeaveType");
	}
	@GetMapping("/delete/{id}")
	public String delteLeaveType(@PathVariable Long id)
	{
		service.delteleaveType(id);
		return("redirect://leaveType");
	}
}
