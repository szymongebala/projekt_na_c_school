package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;

import java.util.List;
import java.util.Optional;

public interface ProjektService {

    Projekt CreateProjekt(String nazwaProjektu);
    List<Projekt> showAll();

   Optional <Projekt> find(Long id);

    Iterable<Projekt> findAll();



}
