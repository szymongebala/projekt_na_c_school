package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.Preservation;
import com.projekt.pakowanie.pakowanie.repository.PreservationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

public class PreservationServiceImpl {
    @Service
    @Transactional
    public class PreservationtServiceImpl  implements PreservationService {
        private PreservationRepository preservationRepository;


        public PreservationtServiceImpl(PreservationRepository preservationRepository) {

            this.preservationRepository = preservationRepository;
        }

        @Override
        @Transactional
        public String createPreservation(String nazwa) {
            Preservation preservation = new Preservation(nazwa);
            preservationRepository.save(preservation);
            return preservation.getNazwa();
        }

        @Override
        public void remotePreservation(Long id) {
            preservationRepository.deleteById(id);

        }
    }}