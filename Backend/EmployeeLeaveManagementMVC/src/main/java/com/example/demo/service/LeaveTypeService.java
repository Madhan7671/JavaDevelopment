package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Leave_TypeRepository;
import com.example.demo.model.Leave_Type;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LeaveTypeService {
	private final Leave_TypeRepository leaverepo;
	public Leave_Type addleave(Leave_Type leavetype)
	{
		return(leaverepo.save(leavetype));
	}
	public List<Leave_Type> getAlltheTypes()
	{
		return(leaverepo.findAll());
	}
	public void delteleaveType(Long id)
	{
		leaverepo.deleteById(id);
	}
}
