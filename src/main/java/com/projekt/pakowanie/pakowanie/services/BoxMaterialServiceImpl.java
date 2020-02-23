package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;
import com.projekt.pakowanie.pakowanie.repository.BoxMaterialRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BoxMaterialServiceImpl implements BoxMaterialService {
    private BoxMaterialRepository boxMaterialRepository;

    public BoxMaterialServiceImpl(BoxMaterialRepository boxMaterialRepository) {
        this.boxMaterialRepository = boxMaterialRepository;
    }

    @Override
    public BoxMaterial CreateBoxMaterial(String nazwa ){

        BoxMaterial boxMaterial=new BoxMaterial(nazwa);
        boxMaterialRepository.save(boxMaterial);
        return boxMaterial;
    }

    @Override
    public List<BoxMaterial> showAll() {
        return (List<BoxMaterial>) boxMaterialRepository.findAll();
    }


}