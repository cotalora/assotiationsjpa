package com.kurisu.assotiationsjpa.presentation.controllers.invoice.mapper;

import com.kurisu.assotiationsjpa.domain.models.Invoice;
import com.kurisu.assotiationsjpa.presentation.controllers.invoice.dto.responses.GetInvoiceResponse;

public class InvoiceWebMapper {
    public static GetInvoiceResponse toGetInvoiceResponse(Invoice invoice) {
        return new GetInvoiceResponse(
                invoice.getId(),
                invoice.getDescription(),
                invoice.getTotal(),
                invoice.getClientId());
    }
}
