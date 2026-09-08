package com.kurisu.assotiationsjpa.presentation.controllers.client;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kurisu.assotiationsjpa.application.ports.in.client.GetClientsUseCase;
import com.kurisu.assotiationsjpa.presentation.controllers.client.dto.responses.GetClientResponse;
import com.kurisu.assotiationsjpa.presentation.controllers.client.mapper.ClientWebMapper;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final GetClientsUseCase getClientsUseCase;

    public ClientController(GetClientsUseCase getClientsUseCase) {
        this.getClientsUseCase = getClientsUseCase;
    }

    @GetMapping("")
    public ResponseEntity<List<GetClientResponse>> getClients() {
        List<GetClientResponse> response = getClientsUseCase.getClients().stream()
                .map(ClientWebMapper::toGetClientResponse)
                .toList();

        return ResponseEntity.ok(response);
    }
}
