package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Inscription;
import ma.raizel.examismailmoufatih.dto.InscriptionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InscriptionMapper {
    private final ModelMapper modelmapper = new ModelMapper();

    public InscriptionDto fromInscriptionToInscriptionDto(Inscription inscription) {
        return modelmapper.map(inscription, InscriptionDto.class);
    }

    public Inscription fromInscriptionDtoToInscription(InscriptionDto inscriptionDto) {
        return modelmapper.map(inscriptionDto, Inscription.class);
    }
}
