package com.projekt.pakowanie.pakowanie.controler;


import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.services.ProjektService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProjektController {
    @Autowired
    public ProjektService projektService;

    public ProjektController(ProjektService projektService) {
        this.projektService = projektService;
    }

    @RequestMapping(value = "/CreateProjekt")
    @ResponseBody



    public Projekt CreateProjekt(@RequestParam String nazwa) {
        return projektService.CreateProjekt(nazwa);
    }

    @RequestMapping(value = "/ProjektShow", method = RequestMethod.GET)
    public List<Projekt> showAll() {
        return projektService.showAll();
    }
}
