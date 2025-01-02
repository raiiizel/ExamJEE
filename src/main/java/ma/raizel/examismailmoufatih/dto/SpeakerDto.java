package ma.raizel.examismailmoufatih.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpeakerDto extends ParticipantDto {
    private String profilProfessionnel;

    private List<ConferenceDto> conferences;

    public void setConferences(List<ConferenceDto> conferences) {
        this.conferences = conferences;
    }
}
