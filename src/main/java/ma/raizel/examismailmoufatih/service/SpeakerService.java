package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dto.SpeakerDto;

import java.util.List;

public interface SpeakerService {
    SpeakerDto addSpeaker(SpeakerDto speakerDto);

    List<SpeakerDto> getAllSpeakers();

    SpeakerDto getSpeakerById(Integer id);

    SpeakerDto updateSpeaker(SpeakerDto speakerDto);

    void deleteSpeaker(Integer id);
}
