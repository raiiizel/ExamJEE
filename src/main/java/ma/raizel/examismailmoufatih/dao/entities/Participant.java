package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private String nom;
    private String email;
    private String photo;
    private String genre;

    @OneToMany(mappedBy = "participant")
    private List<Commentaire> commentaires;
}
