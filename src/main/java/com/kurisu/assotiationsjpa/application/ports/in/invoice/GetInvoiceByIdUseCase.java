package com.kurisu.assotiationsjpa.application.ports.in.invoice;

import java.util.Optional;

import com.kurisu.assotiationsjpa.domain.models.Invoice;

public interface GetInvoiceByIdUseCase {
    Optional<Invoice> getInvoiceById(Long id);
}
