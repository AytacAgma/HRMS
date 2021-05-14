package hrms.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
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
	
	public Position(Integer id, Integer personnelId, String name) {
		super();
		Id = id;
		PersonnelId = personnelId;
		Name = name;
	}
}
