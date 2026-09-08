package com.kurisu.assotiationsjpa.infrastructure.mappers;

import com.kurisu.assotiationsjpa.domain.models.Address;
import com.kurisu.assotiationsjpa.infrastructure.persistence.entities.AddressEntity;

public class AddressPersistenceMapper {
    public AddressPersistenceMapper() {
    }

    public static Address toAddress(AddressEntity entity) {
        return new Address(
                entity.getId(),
                entity.getDescription());
    }
}
