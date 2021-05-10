package kodlamaio.HRMS.dataAccess.abstracts;

import kodlamaio.HRMS.entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositonDao extends JpaRepository<Position, Integer> {
}
