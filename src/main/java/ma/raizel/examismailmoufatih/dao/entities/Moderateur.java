package ma.raizel.examismailmoufatih.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Moderateur extends Participant{
    private String specialite;

    @OneToMany(mappedBy = "moderateur")
    private List<Session> sessions;
}
