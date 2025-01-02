package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dto.ConferenceDto;

import java.util.List;

public interface ConferenceService {
    ConferenceDto addConference(ConferenceDto conferenceDto);

    List<ConferenceDto> getAllConferences();

    ConferenceDto getConferenceById(Integer id);

    ConferenceDto updateConference(ConferenceDto conferenceDto);

    void deleteConference(Integer id);
}
