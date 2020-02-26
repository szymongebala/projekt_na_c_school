package com.projekt.pakowanie.pakowanie.controler;


import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.klasy.modele.Skrzynia;
import com.projekt.pakowanie.pakowanie.services.SkrzyniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
class SkrzyniaController {
	@Autowired
	private SkrzyniaService skrzyniaService;


	public SkrzyniaController(SkrzyniaService skrzyniaService) {
		this.skrzyniaService = skrzyniaService;
	}

	@RequestMapping(value = "/Skrzynia")
	@ResponseBody
	public Skrzynia CreateSkrzynia(@RequestParam("dlugosc") Long dlugosc, @RequestParam("szerokosc") Long szerokosc, @RequestParam("wysokosc") Long wysokosc, @RequestParam("ilosc") Long ilosc) {

		return skrzyniaService.CreateSkrzynia(dlugosc, szerokosc, wysokosc, ilosc);
	}

	@RequestMapping(value = "/SkrzyniaShow", method = RequestMethod.GET)
	public List<Skrzynia> showAll() {
		return skrzyniaService.showAll();
	}

	@RequestMapping("/addSkrzynia/{skrzyniaid}/{projektid}")
	@ResponseBody
	public Optional<Projekt> addInstrukcja(@PathVariable Long skrzyniaid, @PathVariable Long projektid) {
		Optional<Projekt> projekt = skrzyniaService.add(skrzyniaid, projektid);


		return projekt;


	}


}
