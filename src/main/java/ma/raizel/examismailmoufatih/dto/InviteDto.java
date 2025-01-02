package ma.raizel.examismailmoufatih.dto;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Inscription;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InviteDto {
    private String Affiliation;
    private List<InscriptionDto> inscriptions;
}
