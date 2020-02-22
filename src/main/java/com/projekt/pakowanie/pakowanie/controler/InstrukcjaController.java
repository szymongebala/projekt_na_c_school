package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.services.InstrukcjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstrukcjaController {
    @Autowired
    public InstrukcjaService instrukcjaService;
    public InstrukcjaController (InstrukcjaService instrukcjaService) {
        this.instrukcjaService = instrukcjaService;
    }
        @RequestMapping(value = "/CreateInstrukcja")
        @ResponseBody
        public Instrukcja CreateInstrukcja(@RequestParam String nazwaInstrukcji) {
            return instrukcjaService.CreateInstrukcja(nazwaInstrukcji);
        }

        @RequestMapping(value = "/InstrukcjaShow", method = RequestMethod.GET)
        public List<Instrukcja> showAll() {
            return instrukcjaService.showAll();
        }

    }



