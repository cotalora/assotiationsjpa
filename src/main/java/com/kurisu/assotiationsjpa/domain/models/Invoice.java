package com.kurisu.assotiationsjpa.domain.models;

import java.math.BigDecimal;

import com.kurisu.assotiationsjpa.domain.exceptions.invoice.ClientException;
import com.kurisu.assotiationsjpa.domain.exceptions.invoice.DescriptionException;
import com.kurisu.assotiationsjpa.domain.exceptions.invoice.TotalException;

public class Invoice {
    private Long id;
    private String description;
    private BigDecimal total;
    private Long clientId;

    public Invoice(Long id, String description, BigDecimal total, Long clientId) {
        this.id = id;

        if (description == null || description.isEmpty() || description.isBlank()) {
            throw new DescriptionException("Missing description");
        }
        this.description = description;

        if (total == null) {
            throw new TotalException("Missing total");
        }
        if (total.signum() < 0) {
            throw new TotalException("Negative total");
        }
        this.total = total;

        if (clientId == null) {
            throw new ClientException("Missing client");
        }
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Long getClientId() {
        return clientId;
    }
}
