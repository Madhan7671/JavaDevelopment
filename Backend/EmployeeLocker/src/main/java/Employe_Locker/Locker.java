package Employe_Locker;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Locker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long lockerId;
	private String lockerName;
	private String floor;
	public Locker() {
		
	}
	public Locker(String lockerName, String floor) {
		super();
		this.lockerName = lockerName;
		this.floor = floor;
	}
	
}
