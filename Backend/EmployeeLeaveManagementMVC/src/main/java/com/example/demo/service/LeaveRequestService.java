package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Leave_RequestRepository;

import com.example.demo.model.Leave_Request;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class LeaveRequestService {
	@Autowired
	private Leave_RequestRepository leaverepo;  
	
	public Leave_Request apply(Leave_Request leave)
	{
		leave.setStatus("Pending");
		return(leaverepo.save(leave));
	}
	public void Approve(Long id)
	{
		Leave_Request req=leaverepo.findById(id).orElseThrow();
		req.setStatus("Approved");
		leaverepo.save(req);
		return;
	}
	public void Reject(Long id) {
		Leave_Request req=leaverepo.findById(id).orElseThrow();
		req.setStatus("Rejected");
		leaverepo.save(req);
		return;
	}
	public List<Leave_Request> getAllLeaveRequestsOfAnEmployee(Long id){
		return(leaverepo.findByEmployeeEmployeeId(id));
	}
}
