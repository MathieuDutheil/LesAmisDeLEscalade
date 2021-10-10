package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Topo;
import escalade.mathieudutheil.repository.TopoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopoService {

    @Autowired
    private TopoRepository topoRepository;

    public Iterable<Topo> getTopos() {
        return topoRepository.findAll();
    }

    public Optional<Topo> getTopoById(Integer id) {
        return topoRepository.findById(id);
    }

    public Topo saveTopo(Topo topo) {
        return topoRepository.save(topo);
    }

    public void deleteTopoById(Integer id) {
        topoRepository.deleteById(id);
    }
}