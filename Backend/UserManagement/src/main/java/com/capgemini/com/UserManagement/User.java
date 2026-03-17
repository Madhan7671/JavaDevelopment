package com.capgemini.com.UserManagement;

import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long UId;
	private String Uname;
	private String email;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Role> roles;
	public User() {
		
	}
	public User(String uname, String email, Set<Role> roles) {
		super();
		this.Uname = uname;
		this.email = email;
		this.roles = roles;
	}
	
	
}
