package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Grimpeur;
import escalade.mathieudutheil.repository.GrimpeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GrimpeurService {

    @Autowired
    private GrimpeurRepository grimpeurRepository;

    public Iterable<Grimpeur> getGrimpeurs() {
        return grimpeurRepository.findAll();
    }


    public Optional<Grimpeur> getGrimpeurById(Integer id) {
        return grimpeurRepository.findById(id);
    }

    public Grimpeur saveGrimpeur(Grimpeur grimpeur) {
        return grimpeurRepository.save(grimpeur);
    }

    public void deleteGrimpeurById(Integer id) {
        grimpeurRepository.deleteById(id);
    }
}