package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dao.entities.Conference;
import ma.raizel.examismailmoufatih.dao.repositories.ConferenceRepository;
import ma.raizel.examismailmoufatih.dto.ConferenceDto;
import ma.raizel.examismailmoufatih.mapper.ConferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConferenceManager implements ConferenceService {
    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private ConferenceMapper conferenceMapper;

    @Override
    public ConferenceDto addConference(ConferenceDto conferenceDto) {
        Conference conference = conferenceMapper.fromConferenceDtoToConference(conferenceDto);
        Conference savedConference = conferenceRepository.save(conference);
        return conferenceMapper.fromConferenceToConferenceDto(savedConference);
    }

    @Override
    public List<ConferenceDto> getAllConferences() {
        return conferenceRepository.findAll()
                .stream()
                .map(conferenceMapper::fromConferenceToConferenceDto)
                .collect(Collectors.toList());
    }

    @Override
    public ConferenceDto getConferenceById(Integer id) {
        return conferenceMapper.fromConferenceToConferenceDto(conferenceRepository.findById(id).orElse(null));
    }
    @Override
    public ConferenceDto updateConference(ConferenceDto conferenceDto) {
        Conference conference = conferenceMapper.fromConferenceDtoToConference(conferenceDto);
        Conference updatedConference = conferenceRepository.save(conference);
        return conferenceMapper.fromConferenceToConferenceDto(updatedConference);
    }
    @Override
    public void deleteConference(Integer id) {
        conferenceRepository.deleteById(id);
    }

}

