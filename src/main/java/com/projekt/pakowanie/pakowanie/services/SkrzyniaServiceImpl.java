package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import com.projekt.pakowanie.pakowanie.repository.ProjektRepository;
import com.projekt.pakowanie.pakowanie.repository.SkrzyniaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
    @Transactional
    public class SkrzyniaServiceImpl implements SkrzyniaService {
        private SkrzyniaRepository skrzyniaRepository;
        private ProjektRepository projektRepository;

        public SkrzyniaServiceImpl(SkrzyniaRepository skrzyniaRepository,ProjektRepository projektRepository) {
            this.skrzyniaRepository = skrzyniaRepository;
            this.projektRepository=projektRepository;
        }
    @Override
    public Skrzynia CreateSkrzynia( Long dlugosc,Long szerokosc,Long wysokosc,Long ilosc){
        Skrzynia skrzynia=new Skrzynia(dlugosc,szerokosc,wysokosc,ilosc);
        skrzyniaRepository.save(skrzynia);
        return skrzynia;
    }


        @Override
        public List<Skrzynia> showAll() {
            return (List<Skrzynia>) skrzyniaRepository.findAll();
        }
    @Override
    public Optional<Skrzynia> find(Long id) {
        Optional<Skrzynia> instrukcja = skrzyniaRepository.findById(id);
        return instrukcja;
    }

    @Override
    public Optional<Projekt> add(Long idSkrzynia, Long idProjekt ){
        Optional<Projekt> projekt=projektRepository.findById(idProjekt);
        Optional <Skrzynia> skrzynia=skrzyniaRepository.findById(idSkrzynia);
      skrzynia.get().setProjekt(projekt.get());
        projekt.get().getSkrzynia().add(skrzynia.get());

    projektRepository.save(projekt.get());
        return  projekt;
    }



    }


