package hrms.hr.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hr.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer> {

}
