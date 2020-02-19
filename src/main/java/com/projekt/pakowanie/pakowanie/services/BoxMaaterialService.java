package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.Instrukcja;

public interface BoxMaaterialService {
    Long createBoxMatrial (String nazwa, BoxMaterial rodzaj);
    void remoteBoxMaterial(Long id);
}
