package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Commentaire;
import escalade.mathieudutheil.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // ne fonctionne pas pour l'instant
public class CommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;

    public Iterable<Commentaire> getCommentaires(){
        return commentaireRepository.findAll();
    }

    public Optional<Commentaire> getCommentaireById(Integer id){
        return commentaireRepository.findById(id);
    }

    public Commentaire saveCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    public void deleteCommentaireById(Integer id) {
        commentaireRepository.deleteById(id);
    }

}