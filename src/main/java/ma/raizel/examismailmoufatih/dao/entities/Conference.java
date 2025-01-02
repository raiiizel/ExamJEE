package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private Date date;
    private Date heureDebut;
    private Date heureFin;
    private String description;

    @ManyToOne
    private Session session;

    @ManyToOne
    private Speaker speaker;

    @OneToMany(mappedBy = "conference")
    private List<Commentaire> commentaires;
}
