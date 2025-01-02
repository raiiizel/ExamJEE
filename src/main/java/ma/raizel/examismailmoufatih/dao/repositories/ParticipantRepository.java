package ma.raizel.examismailmoufatih.dao.repositories;

import ma.raizel.examismailmoufatih.dao.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
