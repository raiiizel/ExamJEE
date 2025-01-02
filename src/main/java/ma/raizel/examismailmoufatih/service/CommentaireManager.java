package ma.raizel.examismailmoufatih.service;

import ma.raizel.examismailmoufatih.dao.entities.Commentaire;
import ma.raizel.examismailmoufatih.dao.repositories.CommentaireRepository;
import ma.raizel.examismailmoufatih.dto.CommentaireDto;
import ma.raizel.examismailmoufatih.mapper.CommentaireMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentaireManager implements CommentaireService {
    @Autowired
    private CommentaireRepository commentaireRepository;
    @Autowired
    private CommentaireMapper commentaireMapper;

    @Override
    public CommentaireDto addCommentaire(CommentaireDto commentaireDto) {
        return commentaireMapper.fromCommentaireToCommentaireDto(commentaireRepository.save(commentaireMapper.fromCommentaireDtoToCommentaire(commentaireDto)));
    }
    @Override
    public List<CommentaireDto> getAllCommentaires() {
        List<Commentaire> commentaires = commentaireRepository.findAll();
        return commentaires.stream().map(commentaireMapper::fromCommentaireToCommentaireDto).collect(Collectors.toList());
    }
    @Override
    public CommentaireDto getCommentaireById(int id) {
        return commentaireMapper.fromCommentaireToCommentaireDto(commentaireRepository.findById(id).orElse(null));
    }
    @Override
    public void deleteCommentaire(int id) {
        commentaireRepository.deleteById(id);
    }
    @Override
    public CommentaireDto updateCommentaire(CommentaireDto commentaireDto) {
        return commentaireMapper.fromCommentaireToCommentaireDto(commentaireRepository.save(commentaireMapper.fromCommentaireDtoToCommentaire(commentaireDto)));
    }

}
