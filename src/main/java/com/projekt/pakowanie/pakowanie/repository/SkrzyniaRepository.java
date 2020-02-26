package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkrzyniaRepository extends CrudRepository<Skrzynia, Long> {


}
