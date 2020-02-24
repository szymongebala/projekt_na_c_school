package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;

import java.util.List;
import java.util.Optional;

public interface BoxMaterialService {
    BoxMaterial CreateBoxMaterial(String nazwa);
    List<BoxMaterial> showAll();
    Optional <BoxMaterial> find (Long id);
    Optional<BoxMaterial> add(Long id, Long id2);
    Iterable <BoxMaterial>findAll();

}
