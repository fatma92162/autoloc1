
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Vehicule;
import com.example.autoloc1.repositories.VehiculeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public Vehicule ajouter(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifier(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule consulter(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> consulterListe() {
        return vehiculeRepository.findAll();
    }

    @Override
    public void supprimer(Long id) {
        vehiculeRepository.deleteById(id);
    }
}
