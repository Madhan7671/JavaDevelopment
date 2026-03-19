package com.example.demo.service;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserRequestDTO;
import com.example.demo.DTO.UserResponseDTO;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userrepo;

    public UserResponseDTO createUser(UserRequestDTO userresponse)
	{
		if(userrepo.findByEmail(userresponse.getEmail()).isPresent()) {
			throw new RuntimeException("Email already exists");
		}
		User user=new User();
		user.setAge(userresponse.getAge());
		user.setEmail(userresponse.getEmail());
		user.setName(userresponse.getFullname());
		user.setPassword(userresponse.getPassword());
		user.setRole(userresponse.getRole());
		User saved=userrepo.save(user);
		return mapToResponse(saved);
	}

	private UserResponseDTO mapToResponse(User saved) {
		UserResponseDTO response=new UserResponseDTO();
		response.setId(saved.getId());
		response.setAge(saved.getAge());
		response.setEmail(saved.getEmail());
		response.setFullname(saved.getName());
		response.setRole(saved.getRole());
		return response;
	}
	
	public List<UserResponseDTO> getAll(){
		return(userrepo.findAll().stream().map(this::mapToResponse).toList());
	}
	
	public UserResponseDTO getUserById(Long id)
	{
		User user=userrepo.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
		return(mapToResponse(user));
	}
	
	public void delteuser(Long id)
	{
		User user=userrepo.findById(id).orElseThrow(()->new RuntimeException("User not found"));
		userrepo.delete(user);
	}
	public void updateUser(Long id,UserRequestDTO dto)
	{
		User user=userrepo.findById(id).orElseThrow(()->new RuntimeException("User not found"));
		Optional<User> existing=userrepo.findById(id);
		if(existing.isPresent() && !existing.get().getId().equals(id))
		{
			throw new RuntimeException("Email already presents");
		}
		user.setAge(dto.getAge());
		user.setEmail(dto.getEmail());
		user.setName(dto.getFullname());
		user.setPassword(dto.getPassword());
		user.setRole(dto.getRole());
		userrepo.save(user);
	}
	
}
