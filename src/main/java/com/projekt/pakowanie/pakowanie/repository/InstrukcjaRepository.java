package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrukcjaRepository extends CrudRepository<Instrukcja, Long> {
}



