package com.projekt.pakowanie.pakowanie.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.repository.BoxMaterialRepository;
import com.projekt.pakowanie.pakowanie.repository.InstrukcjaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BoxMaterialServiceImpl implements BoxMaterialService {
    private BoxMaterialRepository boxMaterialRepository;
    private InstrukcjaRepository instrukcjaRepository;

    public BoxMaterialServiceImpl(BoxMaterialRepository boxMaterialRepository,InstrukcjaRepository instrukcjaRepository) {
        this.boxMaterialRepository = boxMaterialRepository;
        this.instrukcjaRepository=instrukcjaRepository;
    }


    @Override
    public BoxMaterial CreateBoxMaterial(String nazwa ){

        BoxMaterial boxMaterial=new BoxMaterial(nazwa);
        boxMaterialRepository.save(boxMaterial);
        return boxMaterial;
    }

    @Override
    @JsonIgnore
    public List<BoxMaterial> showAll() {
        return (List<BoxMaterial>) boxMaterialRepository.findAll();
    }

    @Override
    public Optional<BoxMaterial> find(Long id){
        Optional<BoxMaterial> boxMaterial = boxMaterialRepository.findById(id);
        return boxMaterial;
    }
    @Override
    public Optional<BoxMaterial> add(Long idInstrukcja, Long idBoxMaterial ){
        Optional<BoxMaterial> boxMaterial=boxMaterialRepository.findById(idBoxMaterial);
        Optional <Instrukcja> instrukcja=instrukcjaRepository.findById(idInstrukcja);
        instrukcja.get().setBoxMaterial(boxMaterial.get());
        boxMaterial.get().getInstrukcja().add(instrukcja.get());

      boxMaterialRepository.save(boxMaterial.get());
        return  boxMaterial;
    }
    @Override
    public Iterable<BoxMaterial> findAll(){
        return  boxMaterialRepository.findAll();

    }

}