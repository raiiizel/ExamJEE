package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Speaker extends Participant {
    private String profilProfessionnel;

    @OneToMany(mappedBy = "speaker")
    private List<Conference> conferences;

}
