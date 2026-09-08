package com.kurisu.assotiationsjpa.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.kurisu.assotiationsjpa.domain.models.Invoice;
import com.kurisu.assotiationsjpa.domain.repositories.InvoiceRepository;
import com.kurisu.assotiationsjpa.infrastructure.mappers.InvoicePersistenceMapper;
import com.kurisu.assotiationsjpa.infrastructure.persistence.repositories.InvoiceJpaRepository;

@Repository
public class InvoiceRepositoryAdapter implements InvoiceRepository {
    private final InvoiceJpaRepository invoiceJpaRepository;

    public InvoiceRepositoryAdapter(InvoiceJpaRepository invoiceJpaRepository) {
        this.invoiceJpaRepository = invoiceJpaRepository;
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceJpaRepository.findAll().stream()
                .map(InvoicePersistenceMapper::toInvoice)
                .toList();
    }

    @Override
    public Optional<Invoice> findById(Long id) {
        return invoiceJpaRepository.findById(id).map(InvoicePersistenceMapper::toInvoice);
    }
}
