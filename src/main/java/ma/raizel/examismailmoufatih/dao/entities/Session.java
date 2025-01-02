package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    @OneToOne
    private Salle salle;

    @OneToOne
    private Inscription inscription;

    @ManyToOne
    private Moderateur moderateur;

    @OneToMany(mappedBy = "session")
    private List<Conference> conferences;

}
