package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Leave_Request;
import com.example.demo.service.LeaveRequestService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/LeaveRequest")
public class LeaveRequest {
	private LeaveRequestService service;
	@GetMapping("/{id}")
	public String getAllLeaveRRequests(@PathVariable Long id,Model model)
	{
	      model.addAttribute("LeaveRequest",service.getAllLeaveRequestsOfAnEmployee(id));
	      return("LeaveRequests");
	}
	@GetMapping("/New")
	public String showform(Model model)
	{
		model.addAttribute("LeaveRequest",new Leave_Request());
		return("LeaveRequestForm");
	}
}
