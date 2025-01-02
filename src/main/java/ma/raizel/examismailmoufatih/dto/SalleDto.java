package ma.raizel.examismailmoufatih.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Session;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalleDto {
    private Integer id;
    private String nom;
    private Session session;
}
