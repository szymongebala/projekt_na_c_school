package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.BoxMaterial;
import com.projekt.pakowanie.pakowanie.services.BoxMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

public class BoxMaterialController {
    @Autowired
    public BoxMaterialService boxMaterialService;

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
}



