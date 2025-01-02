package ma.raizel.examismailmoufatih.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.raizel.examismailmoufatih.dao.entities.Speaker;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConferenceDto {
    private Integer id;
    private String titre;
    private Date date;
    private Date heureDebut;
    private Date heureFin;
    private String description;

    private SpeakerDto speaker;

    public void setSpeaker(SpeakerDto speaker) {
        this.speaker = speaker;
    }
}
