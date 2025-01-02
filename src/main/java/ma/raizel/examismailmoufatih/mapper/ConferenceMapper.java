package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Conference;
import ma.raizel.examismailmoufatih.dto.ConferenceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConferenceMapper {
    private final ModelMapper modelmapper = new ModelMapper();

    public ConferenceDto fromConferenceToConferenceDto(Conference conference) {
        return modelmapper.map(conference, ConferenceDto.class);
    }

    public Conference fromConferenceDtoToConference(ConferenceDto conferenceDto) {
        return modelmapper.map(conferenceDto, Conference.class);
    }

}
