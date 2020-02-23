package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;

import java.util.List;
import java.util.Optional;

public interface InstrukcjaService {
    Instrukcja CreateInstrukcja(String nazwaInstrukcji);
    List<Instrukcja> showAll();

    Optional<Instrukcja> find(Long id);
    Instrukcja add(Optional projekt,Optional instrukcja);

    Iterable<Instrukcja> findAll();
}
