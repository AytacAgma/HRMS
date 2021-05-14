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
	private Integer Id;
	
	@Column(name="PersonnelId")
	private Integer PersonnelId;
	
	@Column(name="Name")
	private String Name;
	
	public Position() {}
	
	public Position(Integer id, Integer personnelId, String name) {
		super();
		Id = id;
		PersonnelId = personnelId;
		Name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPersonnelId() {
		return PersonnelId;
	}

	public void setPersonnelId(Integer personnelId) {
		PersonnelId = personnelId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
