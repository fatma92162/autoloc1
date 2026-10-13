
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule ajouter(Vehicule vehicule);
    Vehicule modifier(Vehicule vehicule);
    Vehicule consulter(Long id);
    List<Vehicule> consulterListe();
    void supprimer(Long id);
}
