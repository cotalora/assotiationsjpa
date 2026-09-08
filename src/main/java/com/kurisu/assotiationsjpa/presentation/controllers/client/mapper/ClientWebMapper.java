package com.kurisu.assotiationsjpa.presentation.controllers.client.mapper;

import com.kurisu.assotiationsjpa.domain.models.Client;
import com.kurisu.assotiationsjpa.presentation.controllers.client.dto.responses.GetClientResponse;

public class ClientWebMapper {
    public static GetClientResponse toGetClientResponse(Client client) {
        return new GetClientResponse(
                client.getId(),
                client.getName(),
                client.getLastName(),
                client.getAddresses().stream().map(AddressWebMapper::toGetAddressResponse).toList());
    }
}
