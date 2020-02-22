package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;

import java.util.List;

public interface ProjektService {

    Projekt CreateProjekt(String nazwa);
    List<Projekt> showAll();

}
