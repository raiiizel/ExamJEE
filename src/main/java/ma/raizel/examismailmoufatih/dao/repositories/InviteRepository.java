package ma.raizel.examismailmoufatih.dao.repositories;

import ma.raizel.examismailmoufatih.dao.entities.Invite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteRepository extends JpaRepository<Invite, Integer> {
}
