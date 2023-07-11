package com.alanzf.decoderapi.service;

import com.alanzf.decoderapi.model.Decoder;
import com.alanzf.decoderapi.repository.DecoderRepository;
import org.springframework.stereotype.Service;
@Service
public class DecoderService {
    private final String alphabet;
    private final DecoderRepository repository;

    public DecoderService(DecoderRepository repository, String alphabet) {
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.repository = repository;
    }

    public Decoder decodeMessage(Decoder decoder) {
        return repository.save(decoder);
    }

}
