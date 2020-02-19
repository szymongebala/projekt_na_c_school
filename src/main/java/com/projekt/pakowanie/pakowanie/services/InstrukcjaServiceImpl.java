package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.Preservation;
import com.projekt.pakowanie.pakowanie.repository.InstrukcjaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional

public class InstrukcjaServiceImpl implements InstrukcjaService {
    private InstrukcjaRepository instrukcjaRepository;

    public InstrukcjaServiceImpl(InstrukcjaRepository instrukcjaRepository) {
        this.instrukcjaRepository = instrukcjaRepository;
    }

    @Override
    public String createInstrukcjia(String nazwaInstrukcji, BoxMaterial rodzaj, Preservation rodzajPreservation) {
        Instrukcja nowainstrukcja=new Instrukcja(nazwaInstrukcji,rodzaj,rodzajPreservation);
        instrukcjaRepository.save(nowainstrukcja);
        return nowainstrukcja.getNazwaInstrukcji();
    }

    @Override
    public void remoteInstrukcja(Long id) {

    }
}
