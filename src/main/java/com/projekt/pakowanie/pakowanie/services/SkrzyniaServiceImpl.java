package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import com.projekt.pakowanie.pakowanie.repository.SkrzyniaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


    @Service
    @Transactional
    public class SkrzyniaServiceImpl implements SkrzyniaService {
        private SkrzyniaRepository skrzyniaRepository;

        public SkrzyniaServiceImpl(SkrzyniaRepository skrzyniaRepository) {
            this.skrzyniaRepository = skrzyniaRepository;
        }

        @Override
        public Skrzynia CreateSkrzynia(int dlugosc,int szerokosc, int wysokosc, int ilosc){

            Skrzynia skrzynia=new Skrzynia(dlugosc,szerokosc,wysokosc,ilosc);
            skrzyniaRepository.save(skrzynia);
            return skrzynia;
        }

        @Override
        public List<Skrzynia> showAll() {
            return (List<Skrzynia>) skrzyniaRepository.findAll();
        }


    }


