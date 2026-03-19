package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(nullable = false,unique = true)
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	Role role;
	private Integer age;
}
