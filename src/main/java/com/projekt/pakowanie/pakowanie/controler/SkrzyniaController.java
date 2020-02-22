package com.projekt.pakowanie.pakowanie.controler;


import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import com.projekt.pakowanie.pakowanie.services.SkrzyniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class SkrzyniaController {
    @Autowired
    public SkrzyniaService skrzyniaService;

    public SkrzyniaController(SkrzyniaService skrzyniaService) {
        this.skrzyniaService = skrzyniaService;
    }

    @RequestMapping(value = "/CreateSkrzynia")
    @ResponseBody



    public Skrzynia CreateSkrzynia(@RequestParam int dlugosc,@RequestParam int szerokosc,@RequestParam int wysokosc,@RequestParam int ilosc ) {
        return skrzyniaService.CreateSkrzynia( dlugosc, szerokosc,  wysokosc,ilosc );
    }

    @RequestMapping(value = "/SkrzyniaShow", method = RequestMethod.GET)
    public List<Skrzynia> showAll() {
        return skrzyniaService.showAll();
    }
}
