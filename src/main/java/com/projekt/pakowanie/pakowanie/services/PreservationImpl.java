    package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.modele.Preservation;
import com.projekt.pakowanie.pakowanie.repository.InstrukcjaRepository;
import com.projekt.pakowanie.pakowanie.repository.PreservationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

    @Service
    @Transactional
    public class PreservationImpl implements PreservationService {
        private PreservationRepository preservationRepository;
        private InstrukcjaRepository instrukcjaRepository;

        public PreservationImpl(PreservationRepository preservationRepository,InstrukcjaRepository instrukcjaRepository) {
            this.preservationRepository = preservationRepository;
            this.instrukcjaRepository=instrukcjaRepository;
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


        @Override
        public Optional<Preservation> find(Long id) {
            Optional<Preservation> preservation = preservationRepository.findById(id);
            return preservation;
        }

        @Override
        public Optional<Preservation> add(Long idPreservation, Long idInstrukcja ){
            Optional<Instrukcja> instrukcja=instrukcjaRepository.findById(idInstrukcja);
            Optional <Preservation> preservation=preservationRepository.findById(idPreservation);
            instrukcja.get().setPreservation(preservation.get());
            preservation.get().getInstrukcja().add(instrukcja.get());

            instrukcjaRepository.save(instrukcja.get());
            return  preservation;
        }

        @Override
        public Iterable<Preservation> findAll(){
            return  preservationRepository.findAll();

        }
    }


