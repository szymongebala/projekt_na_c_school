package com.projekt.pakowanie.pakowanie.controler;


import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import com.projekt.pakowanie.pakowanie.services.ProjektService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ProjektController {
    @Autowired
    public ProjektService projektService;

    public ProjektController(ProjektService projektService) {
        this.projektService = projektService;
    }


    @RequestMapping(value = "/CreateProjekt")
    @ResponseBody
    public Projekt CreateProjekt(@RequestParam String nazwaProjektu) {
        return projektService.CreateProjekt(nazwaProjektu);
    }

    @RequestMapping(value = "/ProjektShow", method = RequestMethod.GET)
    public List<Projekt> showAll() {
        return projektService.showAll();
    }

    @RequestMapping(value = "ProjekFind")
    public Optional<Projekt> find(@RequestParam Long id) {
        return projektService.find(id);
    }

    @RequestMapping("/projekt-skrzynie")
    @ResponseBody
    public String SkrzynieiProjekty() {
        StringBuilder response = new StringBuilder();

        for (Projekt projekt : projektService.findAll()) {
            response.append(projekt).append("<br>");
            for (Skrzynia skrzynia : projekt.getSkrzynia()) {
                response.append("- ").append(skrzynia).append("<br>");
            }
        }

        return response.toString();
    }

    @RequestMapping("/projekty")
    @ResponseBody
    public String Projekty() {
        StringBuilder response = new StringBuilder();

        for (Projekt projekt : projektService.findAll()) {
            response.append(projekt).append("<br>");
            for (Skrzynia skrzynia : projekt.getSkrzynia()) {
                response.append("- ").append(skrzynia).append("<br>");
            }

            response.append("instrukcja ").append(projekt.getInstrukcja()).append("<br>").append("preservation ")
                    .append(projekt.getInstrukcja().getPreservation()).append("<br>").append(("boxmaterial ")).append(projekt.getInstrukcja().getBoxMaterial())
                    .append("<br>").append("koszt-").append(projekt.getKoszt());

        }

        return response.toString();
    }
@RequestMapping("/projekty/{id}")
    @ResponseBody



public String projekt(@PathVariable Long id){
  StringBuilder response = new StringBuilder();
    Optional<Projekt> projekt = projektService.find(id);
   response.append(projekt.get()).
append("instrukcja ").append(projekt.get().getInstrukcja()).append("<br>").append("preservation ")
            .append(projekt.get().getInstrukcja().getPreservation()).append("<br>").append(("boxmaterial ")).append(projekt.get().getInstrukcja().getBoxMaterial())
            .append("<br>").append("koszt-").append(projekt.get().getKoszt());
return response.toString();

}
@RequestMapping("/projekt/status/{id}")
    public Optional<Projekt> projektstatus(@PathVariable Long id){
    Optional<Projekt> projekt = projektService.find(id);
    int idint =id.intValue();
    switch(idint) {
        case 1: projekt.get().setOfertowany(true);
        case 2:projekt.get().setZamówiony(true);
        case 3:projekt.get().setGotowy(true);
        default:{ projekt.get().setZamówiony(false);
        projekt.get().setOfertowany(false);
        projekt.get().setGotowy(false);}
    }
return projekt;
}
}
