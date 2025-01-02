package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dao.entities.Salle;
import ma.raizel.examismailmoufatih.dao.repositories.SalleRepository;
import ma.raizel.examismailmoufatih.dto.SalleDto;
import ma.raizel.examismailmoufatih.mapper.SalleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SalleManager implements SalleService {
    @Autowired
    private SalleRepository salleRepository;
    @Autowired
    private SalleMapper salleMapper;

    @Override
    public SalleDto addSalle(SalleDto salleDto) {
        return salleMapper.fromSalleToSalleDto(salleRepository.save(salleMapper.fromSalleDtoToSalle(salleDto)));
    }
    @Override
    public List<SalleDto> getAllSalles() {
        List<Salle> salles = salleRepository.findAll();
        return salles.stream().map(salleMapper::fromSalleToSalleDto).collect(Collectors.toList());
    }
    @Override
    public SalleDto getSalleById(int id) {
        return salleMapper.fromSalleToSalleDto(salleRepository.findById(id).orElse(null));
    }
    @Override
    public void deleteSalle(int id) {
        salleRepository.deleteById(id);
    }
    @Override
    public SalleDto updateSalle(SalleDto salleDto) {
        return salleMapper.fromSalleToSalleDto(salleRepository.save(salleMapper.fromSalleDtoToSalle(salleDto)));
    }

}
