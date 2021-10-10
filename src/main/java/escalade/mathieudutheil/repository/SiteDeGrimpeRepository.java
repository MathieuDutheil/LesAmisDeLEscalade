package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.SiteDeGrimpe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteDeGrimpeRepository extends CrudRepository<SiteDeGrimpe, Integer> {
}