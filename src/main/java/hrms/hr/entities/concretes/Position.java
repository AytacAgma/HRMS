package hrms.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Positions")
public class Position {
	
	@Id	
	@GeneratedValue
	@Column(name="Id")
	private int Id;
	
	@Column(name="PersonnelId")
	private int PersonnelId;
	
	@Column(name="Name")
	private String Name;
	
	public Position() {}

	public Position(int id, int personnelId, String name) {
		super();
		Id = id;
		PersonnelId = personnelId;
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getPersonnelId() {
		return PersonnelId;
	}

	public void setPersonnelId(int personnelId) {
		PersonnelId = personnelId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
