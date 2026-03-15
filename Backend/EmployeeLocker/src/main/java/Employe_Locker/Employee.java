package Employe_Locker;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empId;
	private String name;
	private String department;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="LockerId")
	private Locker locker;
	public Employee() {
		
	}
	public Employee(String name, String department, Locker locker) {
		super();
		this.name = name;
		this.department = department;
		this.locker = locker;
	}
	
}
