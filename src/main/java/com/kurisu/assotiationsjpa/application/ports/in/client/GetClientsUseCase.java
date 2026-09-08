package com.kurisu.assotiationsjpa.application.ports.in.client;

import java.util.List;

import com.kurisu.assotiationsjpa.domain.models.Client;

public interface GetClientsUseCase {
    List<Client> getClients();
}
