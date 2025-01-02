package ma.raizel.examismailmoufatih.dao.repositories;

import ma.raizel.examismailmoufatih.dao.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
