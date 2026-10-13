
package com.example.autoloc1.services;

import com.example.autoloc1.entities.Client;
import java.util.List;

public interface IClientService {

    Client ajouter(Client client);

    Client modifier(Client client);

    Client consulter(Long id);

    List<Client> consulterListe();

    void supprimer(Long id);
}
