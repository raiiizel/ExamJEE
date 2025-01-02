package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Session;
import ma.raizel.examismailmoufatih.dto.SessionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SessionMapper {
    private final ModelMapper modelmapper = new ModelMapper();

    public SessionDto fromSessionToSessionDto(Session session) {
        return modelmapper.map(session, SessionDto.class);
    }

    public Session fromSessionDtoToSession(SessionDto sessionDto) {
        return modelmapper.map(sessionDto, Session.class);
    }
}
