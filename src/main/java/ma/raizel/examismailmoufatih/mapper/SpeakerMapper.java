package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Speaker;
import ma.raizel.examismailmoufatih.dto.SpeakerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SpeakerMapper {
    private final ModelMapper modelmapper = new ModelMapper();

    public SpeakerDto fromSpeakerToSpeakerDto(Speaker speaker) {
        return modelmapper.map(speaker, SpeakerDto.class);
    }

    public Speaker fromSpeakerDtoToSpeaker(SpeakerDto speakerDto) {
        return modelmapper.map(speakerDto, Speaker.class);
    }
}
