package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Secteur;
import escalade.mathieudutheil.repository.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SecteurService {

    @Autowired
    private SecteurRepository secteurRepository;

    public Iterable<Secteur> getSecteurs() {
        return secteurRepository.findAll();
    }

    public Optional<Secteur> getSecteurById(Integer id) {
        return secteurRepository.findById(id);
    }

    public Secteur saveSecteur(Secteur secteur) {
        return secteurRepository.save(secteur);
    }

    public void deleteSecteurById(Integer id) {
        secteurRepository.deleteById(id);
    }
}