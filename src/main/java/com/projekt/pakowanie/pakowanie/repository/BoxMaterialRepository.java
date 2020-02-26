package com.projekt.pakowanie.pakowanie.repository;

import org.springframework.stereotype.Repository;


import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface BoxMaterialRepository extends CrudRepository<BoxMaterial, Long> {


}
