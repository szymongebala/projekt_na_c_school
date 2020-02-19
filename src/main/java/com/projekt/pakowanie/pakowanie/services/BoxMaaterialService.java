package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.BoxMaterial;

public interface BoxMaaterialService {
    String createBoxMatrial (String nazwa, BoxMaterial rodzaj);
    void remoteBoxMaterial(Long id);
}
