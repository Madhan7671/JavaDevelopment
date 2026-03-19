package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Leave_Request;
import java.util.*;

@Repository
public interface Leave_RequestRepository extends JpaRepository<Leave_Request, Long>{
	List<Leave_Request> findByEmployeeEmployeeId(Long empId);
}
