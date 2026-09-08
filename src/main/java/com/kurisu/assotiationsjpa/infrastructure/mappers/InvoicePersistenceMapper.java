package com.kurisu.assotiationsjpa.infrastructure.mappers;

import com.kurisu.assotiationsjpa.domain.models.Invoice;
import com.kurisu.assotiationsjpa.infrastructure.persistence.entities.InvoiceEntity;

public class InvoicePersistenceMapper {
    public InvoicePersistenceMapper() {
    }

    public static Invoice toInvoice(InvoiceEntity entity) {
        return new Invoice(
                entity.getId(),
                entity.getDescription(),
                entity.getTotal(),
                entity.getClient().getId());
    }
}
