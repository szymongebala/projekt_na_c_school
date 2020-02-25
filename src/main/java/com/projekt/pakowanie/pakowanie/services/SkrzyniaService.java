package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;

import java.util.List;
import java.util.Optional;

public interface SkrzyniaService {
   Skrzynia CreateSkrzynia(Long dlugosc,Long szerokosc, Long wysokosc,Long ilosc);//tworzy skrzynie
    List<Skrzynia> showAll();//pokazuje wszystkie skrzynie

    Optional<Skrzynia> find(Long id);//szuka skrzyni po id
    Optional <Projekt> add(Long id, Long id2);//dodaje skrzynie do projektu


}
