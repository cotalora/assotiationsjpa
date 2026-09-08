package com.kurisu.assotiationsjpa.presentation.controllers.invoice.dto.responses;

import java.math.BigDecimal;

public record GetInvoiceResponse(
                Long id,
                String description,
                BigDecimal total,
                Long clientId) {
}
