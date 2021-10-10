package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Topo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopoRepository extends CrudRepository<Topo, Integer> {
}