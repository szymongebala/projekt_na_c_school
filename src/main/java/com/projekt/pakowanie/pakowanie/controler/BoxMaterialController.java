package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;
import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.services.BoxMaterialService;
import com.projekt.pakowanie.pakowanie.services.InstrukcjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

public class BoxMaterialController {
    @Autowired
    public BoxMaterialService boxMaterialService;

    public InstrukcjaService instrukcjaService;




    public BoxMaterialController(BoxMaterialService boxMaterialService) {
        this.boxMaterialService = boxMaterialService;
    }

    @RequestMapping(value = "/CreateMaterial")
    @ResponseBody
    public BoxMaterial CreateBoxMaterial(@RequestParam String nazwa) {
        return boxMaterialService.CreateBoxMaterial(nazwa);
    }

    @RequestMapping(value = "/BoxmaterialShow", method = RequestMethod.GET)
    public List<BoxMaterial> showAll() {
        return boxMaterialService.showAll();
    }

    @RequestMapping("/addInstrukcja/{instrukcjaid}/{boxmaterialid}")
    @ResponseBody
    public Optional<BoxMaterial> addBoxMaterial(@PathVariable Long instrukcjaid, @PathVariable Long boxmaterialid) {
        Optional<BoxMaterial> boxMaterial = boxMaterialService.add(instrukcjaid,boxmaterialid);
        return boxMaterial;
    }

    @RequestMapping("/instrukcja-boxmaterial")
    @ResponseBody
    public String BoxmaterialInstrukcja() {
        StringBuilder response = new StringBuilder();

        for(BoxMaterial boxMaterial: boxMaterialService.findAll()) {
            response.append(boxMaterial).append("<br>");
            for(Instrukcja instrukcja: boxMaterial.getInstrukcja()) {      // 1
                response.append("- ").append(instrukcja).append("<br>");
            }
        }

        return response.toString();
    }
    @RequestMapping("/znajdzBoxmaterial/{id}")
    @ResponseBody
    public Optional<BoxMaterial> findBy(@PathVariable Long id){
        Optional<BoxMaterial>boxMaterial =boxMaterialService.find(id);

        return boxMaterial;

    }}


