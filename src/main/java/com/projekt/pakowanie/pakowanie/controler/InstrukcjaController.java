package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.services.InstrukcjaService;
import com.projekt.pakowanie.pakowanie.services.ProjektService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
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
    public Optional<Instrukcja> addInstrukcja(@PathVariable Long projektid,@PathVariable Long instrukcjaid) {

       Optional<Instrukcja> instrukcja = instrukcjaService.add(projektid,instrukcjaid);


        return instrukcja;



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
@RequestMapping("/znajdz/{id}")
    @ResponseBody
    public Optional<Instrukcja>findBy(@PathVariable Long id) throws EntityNotFoundException {
    if(!instrukcjaService.find(id).isPresent()){ throw new EntityNotFoundException("Resource not found!"); }
    else{
     Optional<Instrukcja>instrukcja =instrukcjaService.find(id);

    return instrukcja;

}


}}

