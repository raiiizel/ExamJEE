package ma.raizel.examismailmoufatih.dto;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Conference;
import ma.raizel.examismailmoufatih.dao.entities.Inscription;
import ma.raizel.examismailmoufatih.dao.entities.Moderateur;
import ma.raizel.examismailmoufatih.dao.entities.Salle;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SessionDto {
    private Integer id;
    private String nom;
    private Salle salle;
    private Inscription inscription;
    private Moderateur moderateur;
    private List<ConferenceDto> conferences;
}

