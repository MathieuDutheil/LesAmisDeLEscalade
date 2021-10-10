package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Statut;
import escalade.mathieudutheil.repository.StatutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatutService {

    @Autowired
    private StatutRepository statutRepository;

    public Iterable<Statut> getStatuts(){
        return statutRepository.findAll();
    }

    public Optional<Statut> getStatutById(Integer id) {
        return statutRepository.findById(id);
    }

    public Statut saveStatut(Statut statut) {
        return statutRepository.save(statut);
    }

    public void deleteStatutById(Integer id) {
        statutRepository.deleteById(id);
    }



}