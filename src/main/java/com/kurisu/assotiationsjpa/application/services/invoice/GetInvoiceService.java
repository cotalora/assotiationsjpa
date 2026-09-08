package com.kurisu.assotiationsjpa.application.services.invoice;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kurisu.assotiationsjpa.application.ports.in.invoice.GetInvoiceByIdUseCase;
import com.kurisu.assotiationsjpa.domain.models.Invoice;
import com.kurisu.assotiationsjpa.domain.repositories.InvoiceRepository;

@Service
public class GetInvoiceService implements GetInvoiceByIdUseCase {
    private final InvoiceRepository invoiceRepository;

    public GetInvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Optional<Invoice> getInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }
}
