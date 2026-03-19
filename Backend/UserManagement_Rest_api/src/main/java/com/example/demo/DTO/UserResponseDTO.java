package com.example.demo.DTO;

import com.example.demo.model.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
	private Long id;
	private String fullname;
	private String email;
	private Role role;
	private Integer age;
}
