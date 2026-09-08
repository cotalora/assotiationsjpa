package com.kurisu.assotiationsjpa.presentation.controllers.client.dto.responses;

import java.util.List;

public record GetClientResponse(
        Long id,
        String name,
        String lastName,
        List<GetAddressResponse> address) {
}
