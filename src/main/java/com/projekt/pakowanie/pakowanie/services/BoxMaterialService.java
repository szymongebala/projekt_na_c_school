package com.projekt.pakowanie.pakowanie.services;

        import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;

        import java.util.List;

public interface BoxMaterialService {
    BoxMaterial CreateBoxMaterial(String nazwa);
    List<BoxMaterial> showAll();

}
