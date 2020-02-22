package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;

import java.util.List;

public interface InstrukcjaService {
    Instrukcja CreateInstrukcja(String nazwa);
    List<Instrukcja> showAll();
}
