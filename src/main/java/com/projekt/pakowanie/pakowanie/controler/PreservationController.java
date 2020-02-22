package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.Preservation;
import com.projekt.pakowanie.pakowanie.services.PreservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

public class PreservationController {
    @Autowired
    public PreservationService preservationService;

    public PreservationController(PreservationService PreservationService) {
        this.preservationService = preservationService;
    }

    @RequestMapping(value = "/CreatePreservation")
    @ResponseBody



    public Preservation CreatePreservation(@RequestParam String nazwa) {
        return preservationService.CreatePreservation(nazwa);
    }

    @RequestMapping(value = "/PreservationShow", method = RequestMethod.GET)
    public List<Preservation> showAll() {
        return preservationService.showAll();
    }
}




