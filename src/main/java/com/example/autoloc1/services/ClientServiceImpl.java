
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Client;
import com.example.autoloc1.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client ajouter(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifier(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client consulter(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> consulterListe() {
        return clientRepository.findAll();
    }

    @Override
    public void supprimer(Long id) {
        clientRepository.deleteById(id);
    }
}
