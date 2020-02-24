package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Preservation;

import java.util.List;
import java.util.Optional;

public interface PreservationService {
    Preservation CreatePreservation(String nazwa);
    List<Preservation> showAll();

    Optional<Preservation> find(Long id);
    Optional <Preservation> add(Long id,Long id2);

    Iterable<Preservation> findAll();
}

