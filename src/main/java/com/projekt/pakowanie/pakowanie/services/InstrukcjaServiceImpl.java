package com.projekt.pakowanie.pakowanie.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.repository.InstrukcjaRepository;
import com.projekt.pakowanie.pakowanie.repository.ProjektRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class InstrukcjaServiceImpl  implements InstrukcjaService {

    private InstrukcjaRepository instrukcjaRepository;


    private ProjektRepository projektRepository;

    public InstrukcjaServiceImpl(InstrukcjaRepository instrukcjaRepository, ProjektRepository projektRepository) {
        this.instrukcjaRepository = instrukcjaRepository;
        this.projektRepository = projektRepository;
    }

    @Override
    public Instrukcja CreateInstrukcja(String nazwaInstrukcji) {
        Instrukcja instrukcja = new Instrukcja(nazwaInstrukcji);
        instrukcjaRepository.save(instrukcja);
        return instrukcja;
    }

    @Override
    @JsonIgnore
    public List<Instrukcja> showAll() {
        return (List<Instrukcja>) instrukcjaRepository.findAll();
    }

    @Override
    public Optional<Instrukcja> find(Long id) {
        Optional<Instrukcja> instrukcja = instrukcjaRepository.findById(id);
        return instrukcja;
    }

    @Override
    public Optional<Instrukcja> add(Long idProjekt, Long idInstrukcja ){
     Optional<Instrukcja> instrukcja=instrukcjaRepository.findById(idInstrukcja);
            Optional <Projekt> projekt=projektRepository.findById(idProjekt);
            projekt.get().setInstrukcja(instrukcja.get());
            instrukcja.get().getProjekty().add(projekt.get());

         instrukcjaRepository.save(instrukcja.get());
    return  instrukcja;
    }

    @Override
    public Iterable<Instrukcja> findAll(){
        return  instrukcjaRepository.findAll();

    }
}

