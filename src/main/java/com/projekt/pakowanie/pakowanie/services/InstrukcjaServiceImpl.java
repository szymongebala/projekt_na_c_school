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
    public Instrukcja add(Optional optionalProjekt, Optional optionalInstrukcja) {

        if (optionalProjekt.isPresent() && optionalInstrukcja.isPresent()) {
            Projekt projekt = (Projekt) optionalProjekt.get();
            Instrukcja instrukcja = (Instrukcja) optionalInstrukcja.get();
            instrukcja.getProjekty().add(projekt);
            projekt.setInstrukcja(instrukcja);
            projektRepository.save(projekt);
            instrukcjaRepository.save(instrukcja);

            return instrukcja;

        }

       return instrukcjaRepository.save( (Instrukcja) optionalInstrukcja.get());
    }

    @Override
    public Iterable<Instrukcja> findAll(){
        return  instrukcjaRepository.findAll();

    }
}

