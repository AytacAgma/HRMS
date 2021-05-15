package hrms.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="positions")
public class Position {
	
	@Id	
	@GeneratedValue
	@Column(name="id")
	private int Id;
	
	@Column(name="personnel_id")
	private int PersonnelId;
	
	@Column(name="name")
	private String Name;
}
