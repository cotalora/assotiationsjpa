package com.kurisu.assotiationsjpa.presentation.controllers.client.mapper;

import com.kurisu.assotiationsjpa.domain.models.Address;
import com.kurisu.assotiationsjpa.presentation.controllers.client.dto.responses.GetAddressResponse;

public class AddressWebMapper {
    public static GetAddressResponse toGetAddressResponse(Address address) {
        return new GetAddressResponse(
                address.getId(),
                address.getDescription());
    }
}
