package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.Preservation;

public interface InstrukcjaService {
    Long createInstrukcjia  (String nazwaInstrukcji, BoxMaterial rodzaj, Preservation rodzajPreservation );
    void remoteInstrukcja(Long id);
}
