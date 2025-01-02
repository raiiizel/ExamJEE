package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dao.entities.Session;
import ma.raizel.examismailmoufatih.dao.repositories.SessionRepository;
import ma.raizel.examismailmoufatih.dto.SessionDto;
import ma.raizel.examismailmoufatih.mapper.SessionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SessionManager implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private SessionMapper sessionMapper;

    @Override
    public SessionDto getSessionById(Integer id) {
        return sessionMapper.fromSessionToSessionDto(sessionRepository.findById(id).orElse(null));
    }

    @Override
    public List<SessionDto> getAllSessions() {
        List<Session> sessions = sessionRepository.findAll();
        return sessions.stream().map(sessionMapper::fromSessionToSessionDto).collect(Collectors.toList());
    }

    @Override
    public SessionDto addSession(SessionDto sessionDto) {
        return sessionMapper.fromSessionToSessionDto(sessionRepository.save(sessionMapper.fromSessionDtoToSession(sessionDto)));
    }

    @Override
    public SessionDto updateSession(SessionDto sessionDto) {
        return sessionMapper.fromSessionToSessionDto(sessionRepository.save(sessionMapper.fromSessionDtoToSession(sessionDto)));
    }

    @Override
    public void deleteSession(Integer id) {
        sessionRepository.deleteById(id);
    }
}
