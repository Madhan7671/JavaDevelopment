package com.capgemini.com.Passport_Management;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passId;
	private String passNum;
	private String IssueDate;
	private String ExpiryDate;
	@OneToOne(cascade=CascadeType.ALL)
	Person person;
	public Passport() {
		
	}
	public Passport(String passNum, String issueDate, String expiryDate, Person person) {
		this.IssueDate = issueDate;
		this.ExpiryDate = expiryDate;
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [passId=" + passId + ", passNum=" + passNum + ", IssueDate=" + IssueDate + ", ExpiryDate="
				+ ExpiryDate + "]";
	}
	
}
