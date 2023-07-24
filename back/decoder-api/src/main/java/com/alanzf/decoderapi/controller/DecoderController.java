package com.alanzf.decoderapi.controller;

import com.alanzf.decoderapi.model.Decoder;
import com.alanzf.decoderapi.service.DecoderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DecoderController {

    private final DecoderService decoderService;
    public DecoderController(DecoderService decoderService) {
        this.decoderService = decoderService;
    }
    @PostMapping("/decode")
    public Decoder decodeMessage(@RequestBody Decoder decoder) {
        return decoderService.decodeMessage(decoder);
    }
}