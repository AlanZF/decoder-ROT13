package com.alanzf.decoderapi.dtos;

import jakarta.validation.constraints.NotNull;

/* Only encrypted message */
public class RequestDto {
    @NotNull
    private String message;
    RequestDto(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}