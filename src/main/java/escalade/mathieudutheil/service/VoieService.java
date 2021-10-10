package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Voie;
import escalade.mathieudutheil.repository.VoieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VoieService {

    @Autowired
    private VoieRepository voieRepository;

    public Iterable<Voie> getVoies() {
        return voieRepository.findAll();
    }

    public Optional<Voie> getVoieById(Integer id) {
        return voieRepository.findById(id);
    }

    public Voie saveVoie(Voie voie) {
        return voieRepository.save(voie);
    }

    public void deleteVoieById(Integer id) {
        voieRepository.deleteById(id);
    }
}