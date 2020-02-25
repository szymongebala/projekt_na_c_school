package com.projekt.pakowanie.pakowanie.repository;

import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Test1 {
    @Autowired
    ProjektRepository projektRepository;
    @BeforeEach
    void dodaj(){
        projektRepository.save(new Projekt());

    }
    @Test
public void test(){
        List<Projekt> projekt= (List<Projekt>) projektRepository.findAll();
        Assertions.assertEquals(1,projekt.size());
   }


}
