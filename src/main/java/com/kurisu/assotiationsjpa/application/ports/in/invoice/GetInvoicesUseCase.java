package com.kurisu.assotiationsjpa.application.ports.in.invoice;

import java.util.List;

import com.kurisu.assotiationsjpa.domain.models.Invoice;

public interface GetInvoicesUseCase {
    List<Invoice> getInvoices();
}
