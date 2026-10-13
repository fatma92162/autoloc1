
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouter(Maintenance maintenance);
    Maintenance modifier(Maintenance maintenance);
    Maintenance consulter(Long id);
    List<Maintenance> consulterListe();
    void supprimer(Long id);
}
