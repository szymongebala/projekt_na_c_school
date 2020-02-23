package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.services.InstrukcjaService;
import com.projekt.pakowanie.pakowanie.services.ProjektService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InstrukcjaController {


    @Autowired
    public InstrukcjaService instrukcjaService;
    public ProjektService projektService;

    public InstrukcjaController(InstrukcjaService instrukcjaService) {
        this.instrukcjaService = instrukcjaService;

    }


    @RequestMapping(value = "/CreateIns")
    @ResponseBody
    public Instrukcja CreateInstrukcja(@RequestParam String nazwaInstrukcji) {
        return instrukcjaService.CreateInstrukcja(nazwaInstrukcji);
    }

    @RequestMapping(value = "/InstrukcjaShow", method = RequestMethod.GET)
    public List<Instrukcja> showAll() {
        return instrukcjaService.showAll();
    }

    @RequestMapping("/addProjekt/{projektid}/{instrukcjaid}")
    @ResponseBody
    public String addInstrukcja(@PathVariable Long projektid,@PathVariable Long instrukcjaid) {
        Optional<Projekt> optionalProjekt = projektService.find(projektid);
        Optional<Instrukcja> optionalInstrukcja = instrukcjaService.find(instrukcjaid);


     Instrukcja instrukcja= instrukcjaService.add(optionalProjekt,optionalInstrukcja);

        return InstrukcjeiProjekty();



    }
    @RequestMapping("/projekt-instrukcja")
    @ResponseBody
    public String InstrukcjeiProjekty() {
        StringBuilder response = new StringBuilder();

        for(Instrukcja instrukcja: instrukcjaService.findAll()) {
            response.append(instrukcja).append("<br>");
            for(Projekt projekt: instrukcja.getProjekty()) {      // 1
                response.append("- ").append(projekt).append("<br>");
            }
        }

        return response.toString();
    }

}

