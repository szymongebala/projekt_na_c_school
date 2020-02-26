package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProjektRepository extends CrudRepository<Projekt, Long> {


}
