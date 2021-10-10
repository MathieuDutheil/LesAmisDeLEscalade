package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Voie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoieRepository extends CrudRepository<Voie, Integer> {
}