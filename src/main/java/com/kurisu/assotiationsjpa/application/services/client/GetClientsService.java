package com.kurisu.assotiationsjpa.application.services.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kurisu.assotiationsjpa.application.ports.in.client.GetClientsUseCase;
import com.kurisu.assotiationsjpa.domain.models.Client;
import com.kurisu.assotiationsjpa.domain.repositories.ClientRepository;

@Service
public class GetClientsService implements GetClientsUseCase {
    private final ClientRepository clientRepository;

    public GetClientsService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }
}
