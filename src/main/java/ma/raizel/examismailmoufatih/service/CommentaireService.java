package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dto.CommentaireDto;

import java.util.List;

public interface CommentaireService {
    public CommentaireDto addCommentaire(CommentaireDto commentaireDto);
    public List<CommentaireDto> getAllCommentaires();
    public CommentaireDto getCommentaireById(int id);
    public void deleteCommentaire(int id);
    public CommentaireDto updateCommentaire(CommentaireDto commentaireDto);

}
