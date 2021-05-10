package kodlamaio.HRMS.bussiness.concretes;

import kodlamaio.HRMS.bussiness.abstracts.PositionService;
import kodlamaio.HRMS.dataAccess.abstracts.PositonDao;
import kodlamaio.HRMS.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {
    private PositonDao positonDao;

    @Autowired
    public PositionManager(PositonDao positonDao) {
        this.positonDao = positonDao;
    }




    @Override
    public List<Position> getAll() {
        return this.positonDao.findAll();
    }
}
