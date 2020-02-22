    package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Preservation;
import com.projekt.pakowanie.pakowanie.repository.PreservationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

    @Service
    @Transactional
    public class PreservationImpl implements PreservationService {
        private PreservationRepository preservationRepository;

        public PreservationImpl(PreservationRepository preservationRepository) {
            this.preservationRepository = preservationRepository;
        }

        @Override
        public Preservation CreatePreservation(String nazwaPreservation ){

            Preservation Preservation=new Preservation(nazwaPreservation);
            preservationRepository.save(Preservation);
            return Preservation;
        }

        @Override
        public List<Preservation> showAll() {
            return (List<Preservation>) preservationRepository.findAll();
        }


    }



