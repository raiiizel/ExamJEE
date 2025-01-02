package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dto.SalleDto;

import java.util.List;

public interface SalleService {
    public SalleDto addSalle(SalleDto salleDto);
    public List<SalleDto> getAllSalles();
    public SalleDto getSalleById(int id);
    public void deleteSalle(int id);
    public SalleDto updateSalle(SalleDto salleDto);
}
