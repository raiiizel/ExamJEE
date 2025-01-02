package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dao.entities.Speaker;
import ma.raizel.examismailmoufatih.dao.repositories.SpeakerRepository;
import ma.raizel.examismailmoufatih.dto.SpeakerDto;
import ma.raizel.examismailmoufatih.mapper.SpeakerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpeakerManager implements SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    @Autowired
    private SpeakerMapper speakerMapper;

    @Override
    public SpeakerDto addSpeaker(SpeakerDto speakerDto) {
        Speaker speaker = speakerMapper.fromSpeakerDtoToSpeaker(speakerDto);
        Speaker savedSpeaker = speakerRepository.save(speaker);
        return speakerMapper.fromSpeakerToSpeakerDto(savedSpeaker);
    }

    @Override
    public List<SpeakerDto> getAllSpeakers() {
        return speakerRepository.findAll()
                .stream()
                .map(speakerMapper::fromSpeakerToSpeakerDto)
                .collect(Collectors.toList());
    }

    @Override
    public SpeakerDto getSpeakerById(Integer id) {
        return speakerMapper.fromSpeakerToSpeakerDto(speakerRepository.findById(id).orElse(null));
    }
    @Override
    public SpeakerDto updateSpeaker(SpeakerDto speakerDto) {
        Speaker speaker = speakerMapper.fromSpeakerDtoToSpeaker(speakerDto);
        Speaker updatedSpeaker = speakerRepository.save(speaker);
        return speakerMapper.fromSpeakerToSpeakerDto(updatedSpeaker);
    }
    @Override
    public void deleteSpeaker(Integer id) {
        speakerRepository.deleteById(id);
    }
}
