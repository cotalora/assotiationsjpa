package com.kurisu.assotiationsjpa.infrastructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kurisu.assotiationsjpa.infrastructure.persistence.entities.ClientEntity;

public interface ClientJpaRepository extends JpaRepository<ClientEntity, Long> {

}
