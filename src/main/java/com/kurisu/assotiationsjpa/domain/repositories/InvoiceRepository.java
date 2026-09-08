package com.kurisu.assotiationsjpa.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.kurisu.assotiationsjpa.domain.models.Invoice;

public interface InvoiceRepository {
    List<Invoice> findAll();

    Optional<Invoice> findById(Long id);
}
