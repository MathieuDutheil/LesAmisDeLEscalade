package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Statut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutRepository extends CrudRepository<Statut, Integer> {
}