package Library_management.Email_Mangement;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private Long userId;
	@Column(name="name",nullable=true)
	private String name;
	@ElementCollection
	@CollectionTable(name="user_Columns",joinColumns=@JoinColumn(name="userId"))
	private Set<String> emails=new HashSet<>();
	public User() {
		
	}
	public User(Long userId, String name, Set<String> emails) {
		this.userId = userId;
		this.name = name;
		this.emails = emails;
	}
	
}
