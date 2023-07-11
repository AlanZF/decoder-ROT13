package com.alanzf.decoderapi.service;

import com.alanzf.decoderapi.model.Decoder;
import com.alanzf.decoderapi.repository.DecoderRepository;
import com.alanzf.decoderapi.utils.Rot13Decoder;
import org.springframework.stereotype.Service;
@Service
public class DecoderService {
    private final DecoderRepository repository;

    public DecoderService(DecoderRepository repository) {
        this.repository = repository;
    }

    public Decoder decodeMessage(Decoder decoder) {
        Decoder response = new Decoder();
        response.setDecipheredMessage(Rot13Decoder.decode(decoder.getMessage()));
        response.setMessage(decoder.getMessage());
        return repository.save(response);
    }

}
