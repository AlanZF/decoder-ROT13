package com.alanzf.decoderapi.repository;

import com.alanzf.decoderapi.model.Decoder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DecoderRepository extends JpaRepository<Decoder, Integer> {

}
