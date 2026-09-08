package com.kurisu.assotiationsjpa.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.kurisu.assotiationsjpa.domain.models.Client;

public interface ClientRepository {
    List<Client> findAll();

    Optional<Client> findById(Long id);
}
