package com.capgemini.com.Passport_Management;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String DOB;
	@OneToOne(cascade=CascadeType.ALL)
	Passport passport;
	public Person() {
		
	}
	public Person(String name, String dOB) {
		this.name = name;
		this.DOB = dOB;
	}
	
	
}
