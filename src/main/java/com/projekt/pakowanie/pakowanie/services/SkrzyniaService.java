package com.projekt.pakowanie.pakowanie.services;

public interface SkrzyniaService {
    Long createSkrzynia (Long id, int dlugoscSkrzyni,int szerokoscSkrzyni, int wysokoscSkrzyni );
    void remoteSkrzynia(Long id);
}
