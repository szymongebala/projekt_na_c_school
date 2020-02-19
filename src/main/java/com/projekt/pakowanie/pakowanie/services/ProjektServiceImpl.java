package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.Projekt;
import com.projekt.pakowanie.pakowanie.repository.InstrukcjaRepository;
import com.projekt.pakowanie.pakowanie.repository.ProjektRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProjektServiceImpl  implements ProjektService{
     private ProjektRepository projektRepository;
     private InstrukcjaRepository instrukcjasRepository;

    public ProjektServiceImpl(ProjektRepository projektRepository, InstrukcjaRepository instrukcjasRepository) {
        this.projektRepository = projektRepository;
        this.instrukcjasRepository = instrukcjasRepository;
    }

    @Override
    @Transactional
    public String createProject(String nazwaProjektu, Instrukcja nazwaInstrukcji) {
        Projekt projekt=new Projekt(nazwaProjektu, nazwaInstrukcji );
        projektRepository.save(projekt);
        return projekt.getNazwaProjektu();
    }

    @Override
    public void remoteProjekt(Long id) {projektRepository.deleteById(id);


    }
}
