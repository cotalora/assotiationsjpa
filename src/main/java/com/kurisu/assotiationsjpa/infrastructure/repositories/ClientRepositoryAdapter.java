package com.kurisu.assotiationsjpa.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.kurisu.assotiationsjpa.domain.models.Client;
import com.kurisu.assotiationsjpa.domain.repositories.ClientRepository;
import com.kurisu.assotiationsjpa.infrastructure.mappers.ClientPersistenceMapper;
import com.kurisu.assotiationsjpa.infrastructure.persistence.repositories.ClientJpaRepository;

@Repository
public class ClientRepositoryAdapter implements ClientRepository {
    private final ClientJpaRepository clientJpaRepository;

    public ClientRepositoryAdapter(ClientJpaRepository clientJpaRepository) {
        this.clientJpaRepository = clientJpaRepository;
    }

    @Override
    public List<Client> findAll() {
        return clientJpaRepository.findAll().stream().map(ClientPersistenceMapper::toClient).toList();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientJpaRepository.findById(id).map(ClientPersistenceMapper::toClient);
    }
}
