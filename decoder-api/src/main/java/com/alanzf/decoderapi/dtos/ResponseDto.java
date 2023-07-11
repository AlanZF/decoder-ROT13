package com.alanzf.decoderapi.dtos;

import jakarta.validation.constraints.NotNull;

/* Only deciphered message */
public class ResponseDto {

    @NotNull
    private String decipheredMessage;
    ResponseDto(String decipheredMessage) {
        this.decipheredMessage = decipheredMessage;
    }
    public String getMessage() {
        return decipheredMessage;
    }

    public void setMessage(String message) {
        this.decipheredMessage = message;
    }


}
