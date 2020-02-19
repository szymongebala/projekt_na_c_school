package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.Skrzynia;
import com.projekt.pakowanie.pakowanie.repository.SkrzyniaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SkrzyniaServiceImpl implements SkrzyniaService {
    private SkrzyniaRepository skrzyniaRepository;

    public SkrzyniaServiceImpl(SkrzyniaRepository skrzyniaRepository) {
        this.skrzyniaRepository = skrzyniaRepository;
    }

    @Override
    public Long createSkrzynia(Long id, int dlugoscSkrzyni, int szerokoscSkrzyni, int wysokoscSkrzyni) {
        Skrzynia skrzynia=new Skrzynia(id,dlugoscSkrzyni,szerokoscSkrzyni,wysokoscSkrzyni);
        skrzyniaRepository.save(skrzynia);
        return skrzynia.getId();
    }

    @Override
    public void remoteSkrzynia(Long id) {skrzyniaRepository.deleteById(id);

    }
}
