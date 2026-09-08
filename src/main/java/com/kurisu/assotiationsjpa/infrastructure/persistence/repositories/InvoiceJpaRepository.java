package com.kurisu.assotiationsjpa.infrastructure.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kurisu.assotiationsjpa.infrastructure.persistence.entities.InvoiceEntity;

public interface InvoiceJpaRepository extends JpaRepository<InvoiceEntity, Long> {

    // NOTE: Loads invoices and clients together to avoid N+1 queries.
    @EntityGraph(attributePaths = "client")
    @Override
    List<InvoiceEntity> findAll();
}
