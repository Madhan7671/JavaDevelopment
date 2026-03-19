package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Leave_Type;

@Repository
public interface Leave_TypeRepository extends JpaRepository<Leave_Type, Long>{

}
