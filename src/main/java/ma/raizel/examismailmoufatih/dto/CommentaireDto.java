package ma.raizel.examismailmoufatih.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Conference;
import ma.raizel.examismailmoufatih.dao.entities.Participant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentaireDto {
    private Integer id;
    private String contenu;
    private String date;
    private Integer nbLike;

    private ConferenceDto conference;

    private ParticipantDto participant;

}
