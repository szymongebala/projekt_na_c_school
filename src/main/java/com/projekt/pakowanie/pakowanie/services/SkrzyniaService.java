package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;

import java.util.List;

public interface SkrzyniaService {
   Skrzynia CreateSkrzynia(int dlugosc,int szerokosc, int wysokosc ,int ilosc);
    List<Skrzynia> showAll();
}
