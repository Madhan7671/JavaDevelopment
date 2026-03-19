package com.example.demo.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserRequestDTO;
import com.example.demo.DTO.UserResponseDTO;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
	private UserService service;
	@GetMapping
	public List<UserResponseDTO> getAllUsers(){
		return(service.getAll());
	}
	@GetMapping("/{id}")
	public UserResponseDTO getUserById(@PathVariable Long id)
	{
		return(service.getUserById(id));
	}
	@PostMapping
	public ResponseEntity<UserResponseDTO> createuser(@RequestBody @Valid UserRequestDTO dto)
	{
		return(new ResponseEntity<>(service.createUser(dto),HttpStatus.CREATED));
	}
	@PutMapping("{id}")
	public void updateUser(@RequestBody @Valid UserRequestDTO dto,@PathVariable Long id)
	{
		service.updateUser(id, dto);
	}
	@DeleteMapping("{id}")
	public void delteUser(@PathVariable Long id) {
		service.delteuser(id);
	}
}
