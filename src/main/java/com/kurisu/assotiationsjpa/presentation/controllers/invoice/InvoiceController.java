package com.kurisu.assotiationsjpa.presentation.controllers.invoice;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kurisu.assotiationsjpa.application.ports.in.invoice.GetInvoiceByIdUseCase;
import com.kurisu.assotiationsjpa.application.ports.in.invoice.GetInvoicesUseCase;
import com.kurisu.assotiationsjpa.domain.models.Invoice;
import com.kurisu.assotiationsjpa.presentation.controllers.invoice.dto.responses.GetInvoiceResponse;
import com.kurisu.assotiationsjpa.presentation.controllers.invoice.mapper.InvoiceWebMapper;
import com.kurisu.assotiationsjpa.presentation.controllers.shared.dto.ErrorResponse;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    private final GetInvoicesUseCase getInvoicesUseCase;
    private final GetInvoiceByIdUseCase getInvoiceByIdUseCase;

    public InvoiceController(GetInvoicesUseCase getInvoicesUseCase, GetInvoiceByIdUseCase getInvoiceByIdUseCase) {
        this.getInvoicesUseCase = getInvoicesUseCase;
        this.getInvoiceByIdUseCase = getInvoiceByIdUseCase;
    }

    @GetMapping("")
    public ResponseEntity<List<GetInvoiceResponse>> getInvoices() {
        List<GetInvoiceResponse> response = getInvoicesUseCase.getInvoices().stream()
                .map(InvoiceWebMapper::toGetInvoiceResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getInvoiceById(@PathVariable Long id) {
        Optional<Invoice> invoice = getInvoiceByIdUseCase.getInvoiceById(id);

        if (invoice.isEmpty()) {
            ErrorResponse errorResponse = new ErrorResponse(
                    "Invoice not found",
                    "The invoice with the specified ID was not found.",
                    "INVOICE_NOT_FOUND");

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

        GetInvoiceResponse response = InvoiceWebMapper.toGetInvoiceResponse(invoice.get());

        return ResponseEntity.ok(response);
    }
}
