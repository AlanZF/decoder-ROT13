package com.alanzf.decoderapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Decoder")
public class Decoder {


    @Column(name="message", nullable=false)
    private String message;

    @Column(name="decipheredMessage", nullable=true)
    private String decipheredMessage;
    //private final String alphabet;

    Decoder(String message, String decipheredMessage, String alphabet) {
        this.message = message;
        this.decipheredMessage = decipheredMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDecipheredMessage() {
        return decipheredMessage;
    }

    public void setDecipheredMessage(String decipheredMessage) {
        this.decipheredMessage = decipheredMessage;
    }

}
