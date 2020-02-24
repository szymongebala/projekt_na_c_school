package com.projekt.pakowanie.pakowanie.controler;


import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import com.projekt.pakowanie.pakowanie.services.ProjektService;
import com.projekt.pakowanie.pakowanie.services.SkrzyniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController

public class SkrzyniaController {
    @Autowired
public SkrzyniaService skrzyniaService;
public ProjektService projektService;

    public SkrzyniaController(SkrzyniaService skrzyniaService) {
        this.skrzyniaService = skrzyniaService;
    }

    @RequestMapping(value="/CreateSkrzynia" )
    @ResponseBody
    public Skrzynia CreateSkrzynia() {

        return skrzyniaService.CreateSkrzynia( );
    }

    @RequestMapping(value = "/SkrzyniaShow", method = RequestMethod.GET)
    public List<Skrzynia> showAll() {
        return skrzyniaService.showAll();
    }

    @RequestMapping("/addSkrzynia/{skrzyniaid}/{projektid}")
    @ResponseBody
    public Optional<Projekt> addInstrukcja(@PathVariable Long projektid, @PathVariable Long instrukcjaid) {
        Optional<Projekt> projekt= skrzyniaService.add(projektid,instrukcjaid);



        return projekt;



    }



}
