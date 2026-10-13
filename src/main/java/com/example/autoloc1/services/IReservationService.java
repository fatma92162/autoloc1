
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouter(Reservation reservation);
    Reservation modifier(Reservation reservation);
    Reservation consulter(Long id);
    List<Reservation> consulterListe();
    void supprimer(Long id);
}
