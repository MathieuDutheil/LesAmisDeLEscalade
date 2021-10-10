package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Grimpeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrimpeurRepository extends CrudRepository<Grimpeur, Integer> {
}