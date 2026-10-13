
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Reservation;
import com.example.autoloc1.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation ajouter(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifier(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation consulter(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> consulterListe() {
        return reservationRepository.findAll();
    }

    @Override
    public void supprimer(Long id) {
        reservationRepository.deleteById(id);
    }
}
