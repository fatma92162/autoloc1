
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Agence;
import java.util.List;

public interface IAgenceService {
    Agence ajouter(Agence agence);
    Agence modifier(Agence agence);
    Agence consulter(Long id);
    List<Agence> consulterListe();
    void supprimer(Long id);
}
