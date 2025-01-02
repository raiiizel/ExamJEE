package ma.raizel.examismailmoufatih.dto;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Session;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModerateurDto {
    private String specialite;
    private List<SessionDto> sessions;
}
