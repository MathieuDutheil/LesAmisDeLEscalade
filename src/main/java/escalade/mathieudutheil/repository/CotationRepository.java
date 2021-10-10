package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Cotation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotationRepository extends CrudRepository<Cotation, Integer> {
}