
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouter(Contrat contrat);
    Contrat modifier(Contrat contrat);
    Contrat consulter(Long id);
    List<Contrat> consulterListe();
    void supprimer(Long id);
}
