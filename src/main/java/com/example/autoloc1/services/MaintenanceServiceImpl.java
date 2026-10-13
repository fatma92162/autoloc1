
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Maintenance;
import com.example.autoloc1.repositories.MaintenanceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceServiceImpl(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    @Override
    public Maintenance ajouter(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifier(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance consulter(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> consulterListe() {
        return maintenanceRepository.findAll();
    }

    @Override
    public void supprimer(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
