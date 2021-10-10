package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Commentaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Integer> {
}