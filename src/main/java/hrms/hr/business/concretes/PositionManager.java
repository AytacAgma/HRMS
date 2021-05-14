package hrms.hr.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hr.business.abstracts.PositionService;
import hrms.hr.dataAccess.abstracts.PositionDao;
import hrms.hr.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {
	
	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		return this.positionDao.findAll();
		
	}

}
