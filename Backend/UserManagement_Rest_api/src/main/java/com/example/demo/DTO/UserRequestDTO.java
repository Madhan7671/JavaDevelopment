package com.example.demo.DTO;

import com.example.demo.model.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
	@NotBlank
	@Size(min=3)
	private String fullname;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	@Size(min=8)
	private String password;
	private Role role;
	@NotNull
	@Min(18)
	@Max(60)
	private Integer age;
}
