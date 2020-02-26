package com.projekt.pakowanie.pakowanie.controler;

import com.projekt.pakowanie.pakowanie.klasy.modele.Instrukcja;
import com.projekt.pakowanie.pakowanie.klasy.modele.Preservation;
import com.projekt.pakowanie.pakowanie.services.InstrukcjaService;
import com.projekt.pakowanie.pakowanie.services.PreservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class PreservationController {
	@Autowired
	private PreservationService preservationService;
	private InstrukcjaService instrukcjaService;

	public PreservationController(PreservationService PreservationService) {
		this.preservationService = preservationService;
		this.instrukcjaService = instrukcjaService;
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

	@RequestMapping("/addPreservation/{preservationid}/{instrukcjaid}")
	@ResponseBody
	public Optional<Instrukcja> addInstrukcja(@PathVariable Long preservationid, @PathVariable Long instrukcjaid) {
		Optional<Instrukcja> instrukcja = instrukcjaService.add(preservationid, instrukcjaid);


		return instrukcja;


	}

}




