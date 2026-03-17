package com.capgemini.com.BookManagementBidirectional;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long BookId;
	private String title;
	@ManyToMany(mappedBy = "book")
	Set<Author> author=new HashSet<>();
	public Book(String title) {
		this.title = title;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", title=" + title + "]";
	}
	
}
