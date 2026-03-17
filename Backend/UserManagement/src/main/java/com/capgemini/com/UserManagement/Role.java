package com.capgemini.com.UserManagement;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long roleId;
	private String roleName;
	public Role() {
		
	}
	public Role(String roleName) {
		this.roleName = roleName;
	}
}
