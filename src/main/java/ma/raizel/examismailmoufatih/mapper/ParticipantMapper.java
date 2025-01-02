package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Participant;
import ma.raizel.examismailmoufatih.dto.ParticipantDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ParticipantMapper {
    private final ModelMapper modelmapper = new ModelMapper();
    public ParticipantDto fromParticipantToParticipantDto(Participant participant){
        return modelmapper.map(participant, ParticipantDto.class);
    }
    public Participant fromParticipantDtoToParticipant(ParticipantDto participantDto){
        return modelmapper.map(participantDto, Participant.class);
    }

}
