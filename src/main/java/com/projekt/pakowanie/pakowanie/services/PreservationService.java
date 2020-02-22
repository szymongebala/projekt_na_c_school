package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Preservation;

import java.util.List;

public interface PreservationService {
    Preservation CreatePreservation(String nazwa);
    List<Preservation> showAll();
}

