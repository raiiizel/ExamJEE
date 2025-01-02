package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Moderateur;
import ma.raizel.examismailmoufatih.dto.ModerateurDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModerateurMapper {
    private final ModelMapper modelmapper = new ModelMapper();
    public ModerateurDto fromModerateurToModerateurDto(Moderateur moderateur){
        return modelmapper.map(moderateur, ModerateurDto.class);
    }
    public Moderateur fromModerateurDtoToModerateur(ModerateurDto moderateurDto){
        return modelmapper.map(moderateurDto, Moderateur.class);
    }
}
