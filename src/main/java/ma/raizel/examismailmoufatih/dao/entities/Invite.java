package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Invite extends Participant {
    private String Affiliation;

    @OneToMany(mappedBy = "invite")
    private List<Inscription> inscriptions;
}
