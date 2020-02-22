package com.projekt.pakowanie.pakowanie.services;


import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.repository.ProjektRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
    public class ProjektServiceImpl implements ProjektService {
        private ProjektRepository projektRepository;

        public ProjektServiceImpl(ProjektRepository projektRepository) {
            this.projektRepository = projektRepository;
        }

        @Override
        public Projekt CreateProjekt(String nazwa ){

            Projekt Projekt=new Projekt(nazwa);
            projektRepository.save(Projekt);
            return Projekt;
        }

        @Override
        public List<Projekt> showAll() {
            return (List<Projekt>) projektRepository.findAll();
        }



}
