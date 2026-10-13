
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Contrat;
import com.example.autoloc1.repositories.ContratRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat ajouter(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifier(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat consulter(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> consulterListe() {
        return contratRepository.findAll();
    }

    @Override
    public void supprimer(Long id) {
        contratRepository.deleteById(id);
    }
}
