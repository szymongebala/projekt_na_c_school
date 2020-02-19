package com.projekt.pakowanie.pakowanie.services;


import com.projekt.pakowanie.pakowanie.klasy.Preservation;

public interface PreservationService {
    Long createPreservation (String nazwa,String nazwaPreservation);
    void remotePreservation(Long id);
}
