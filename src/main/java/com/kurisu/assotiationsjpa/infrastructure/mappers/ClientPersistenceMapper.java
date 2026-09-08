package com.kurisu.assotiationsjpa.infrastructure.mappers;

import com.kurisu.assotiationsjpa.domain.models.Client;
import com.kurisu.assotiationsjpa.infrastructure.persistence.entities.ClientEntity;

public class ClientPersistenceMapper {
    public ClientPersistenceMapper() {
    }

    public static Client toClient(ClientEntity entity) {
        return new Client(
                entity.getId(),
                entity.getName(),
                entity.getLastName(),
                entity.getAddresses().stream().map(AddressPersistenceMapper::toAddress).toList());

    }
}
