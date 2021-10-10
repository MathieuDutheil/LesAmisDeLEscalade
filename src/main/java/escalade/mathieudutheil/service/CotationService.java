package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Cotation;
import escalade.mathieudutheil.repository.CotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CotationService {

    @Autowired
    private CotationRepository cotationRepository;

    public Iterable<Cotation> getCotations(){
        return cotationRepository.findAll();
    }

    public Optional<Cotation> getCotationById(Integer id){
        return cotationRepository.findById(id);
    }

    public Cotation saveCotation(Cotation cotation) {
        return cotationRepository.save(cotation);
    }

    public void deleteCotationById(Integer id) {
        cotationRepository.deleteById(id);
    }
}