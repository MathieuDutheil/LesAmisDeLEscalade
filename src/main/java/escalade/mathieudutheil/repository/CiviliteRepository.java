package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Civilite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiviliteRepository extends CrudRepository<Civilite, Integer> {
}