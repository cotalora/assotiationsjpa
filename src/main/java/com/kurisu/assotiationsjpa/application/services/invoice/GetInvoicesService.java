package com.kurisu.assotiationsjpa.application.services.invoice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kurisu.assotiationsjpa.application.ports.in.invoice.GetInvoicesUseCase;
import com.kurisu.assotiationsjpa.domain.models.Invoice;
import com.kurisu.assotiationsjpa.domain.repositories.InvoiceRepository;

@Service
public class GetInvoicesService implements GetInvoicesUseCase {
    private final InvoiceRepository invoiceRepository;

    public GetInvoicesService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }
}
