package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;

import java.util.List;
import java.util.Optional;

public interface SkrzyniaService {
   Skrzynia CreateSkrzynia();
    List<Skrzynia> showAll();

    Optional<Skrzynia> find(Long id);
    Optional <Projekt> add(Long id, Long id2);


}
