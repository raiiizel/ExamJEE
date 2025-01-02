package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.*;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    @OneToOne
    private Session session;


}
