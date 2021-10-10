package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.repository.CiviliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CiviliteService {

    @Autowired
    private CiviliteService civiliteService;

    @Autowired
    private CiviliteRepository civiliteRepository;

    public CiviliteRepository getCiviliteRepository() {
        return civiliteRepository;
    }

    public void setCiviliteRepository(CiviliteRepository civiliteRepository) {
        this.civiliteRepository = civiliteRepository;
    }

    public Iterable<Civilite> getCivilites() {
        return civiliteRepository.findAll();
    }

    public Optional<Civilite> getCiviliteById(Integer id) {
        return civiliteRepository.findById(id);
    }

    public Civilite saveCivilite(Civilite civilite) {
        return civiliteRepository.save(civilite);
    }

    public void deleteCiviliteById(Integer id) {
        civiliteRepository.deleteById(id);
    }


}