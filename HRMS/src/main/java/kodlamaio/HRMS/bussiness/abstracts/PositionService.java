package kodlamaio.HRMS.bussiness.abstracts;

import kodlamaio.HRMS.entities.concretes.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAll();
}
