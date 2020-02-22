package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.repository.InstrukcjaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class InstrukcjaServiceImpl  implements InstrukcjaService{

    private InstrukcjaRepository instrukcjaRepository;

    public InstrukcjaServiceImpl(InstrukcjaRepository instrukcjaRepository) {
        this.instrukcjaRepository = instrukcjaRepository;
    }

    @Override
    public Instrukcja CreateInstrukcja(String nazwa) {
        Instrukcja instrukcja=new Instrukcja(nazwa);
       instrukcjaRepository.save(instrukcja);
       return instrukcja;
    }

    @Override
    public List<Instrukcja> showAll() {
        return (List<Instrukcja>)instrukcjaRepository.findAll();
    }
}
