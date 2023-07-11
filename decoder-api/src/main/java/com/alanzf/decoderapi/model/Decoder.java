package com.alanzf.decoderapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="Decoder")
@SequenceGenerator(name="seq_dec", sequenceName="dec_seq", allocationSize=1)
public class Decoder {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq_dec")
    @Column(name="id")
    private Integer id;
    @Column(name="message", nullable=false)
    private String message;

    @Column(name="decipheredMessage", nullable=true)
    private String decipheredMessage;

    public Decoder() {}
    public Decoder(String message, String decipheredMessage, String alphabet) {
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
