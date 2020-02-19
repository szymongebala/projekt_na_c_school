package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.Instrukcja;

public interface ProjektService {
    Long createProject (String nazwaProjektu, Instrukcja nazwaInstrukcji );
    void remoteProjekt(Long id);
}
