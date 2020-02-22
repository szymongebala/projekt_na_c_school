package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface ProjektRepository extends CrudRepository<Projekt,String> {
Page<Projekt> findByInstrukcja(Instrukcja nazwaInstrukcji, Pageable pageable);
Page<Projekt> findByBoxMaterial(BoxMaterial nazwa, Pageable pageable);


   //Projekt CreateProjekt (String nazwaProjektu);
    void deleteById(Long id);
}
