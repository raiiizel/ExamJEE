package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Salle;
import ma.raizel.examismailmoufatih.dto.SalleDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SalleMapper {
    private final ModelMapper modelmapper = new ModelMapper();

    public SalleDto fromSalleToSalleDto(Salle salle) {
        return modelmapper.map(salle, SalleDto.class);
    }

    public Salle fromSalleDtoToSalle(SalleDto salleDto) {
        return modelmapper.map(salleDto, Salle.class);
    }
}
