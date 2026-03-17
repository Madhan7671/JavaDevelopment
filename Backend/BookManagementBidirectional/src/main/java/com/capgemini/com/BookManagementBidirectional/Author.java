package com.capgemini.com.BookManagementBidirectional;


import java.util.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long AuthorId;
	private String AuthorName;
	@ManyToMany(cascade = CascadeType.ALL)
	Set<Book> book=new HashSet<>();
	public Author(String authorName) {
		AuthorName = authorName;
	}
	
}
