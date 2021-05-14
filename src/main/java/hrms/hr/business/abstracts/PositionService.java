package hrms.hr.business.abstracts;

import java.util.List;

import hrms.hr.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();

}
