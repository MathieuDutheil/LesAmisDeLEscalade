package escalade.mathieudutheil.service;

import escalade.mathieudutheil.model.Reservation;
import escalade.mathieudutheil.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Iterable<Reservation> getReservations(){
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Integer id){
        return reservationRepository.findById(id);
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservationById(Integer id) {
        reservationRepository.deleteById(id);
    }
}