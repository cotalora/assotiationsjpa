package com.kurisu.assotiationsjpa.presentation.controllers.shared.dto;

public record ErrorResponse(
        String title,
        String message,
        String code) {

}
