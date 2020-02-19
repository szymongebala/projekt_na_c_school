package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.Projekt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface ProjektRepository extends CrudRepository<Projekt,String> {
Page<Projekt> findByInstrukcja(Instrukcja nazwaInstrukcji, Pageable pageable);
Page<Projekt> findByBoxMaterial(BoxMaterial nazwa, Pageable pageable);

}
