package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dto.SessionDto;

import java.util.List;

public interface SessionService {
    public SessionDto addSession(SessionDto session);

    public List<SessionDto> getAllSessions();

    public SessionDto getSessionById(Integer id);

    public SessionDto updateSession(SessionDto session);

    public void deleteSession(Integer id);

}
