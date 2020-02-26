package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.services.InstrukcjaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test2 {
    @Autowired
    private
    InstrukcjaService instrukcjaService;


    @Test
    void czytaj() {
        Long id = 1L;
        Instrukcja instrukcja = instrukcjaService.CreateInstrukcja("nazwa");


        Assertions.assertTrue(instrukcja.getNazwaInstrukcji().equals("nazwa"));


    }
}
