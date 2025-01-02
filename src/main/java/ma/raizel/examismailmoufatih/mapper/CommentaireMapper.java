package ma.raizel.examismailmoufatih.mapper;

import ma.raizel.examismailmoufatih.dao.entities.Commentaire;
import ma.raizel.examismailmoufatih.dto.CommentaireDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CommentaireMapper {

    private final ModelMapper modelmapper = new ModelMapper();

    public CommentaireDto fromCommentaireToCommentaireDto(Commentaire commentaire) {
        return modelmapper.map(commentaire, CommentaireDto.class);
    }
    public Commentaire fromCommentaireDtoToCommentaire(CommentaireDto commentaireDto) {
        return modelmapper.map(commentaireDto, Commentaire.class);
    }

}
