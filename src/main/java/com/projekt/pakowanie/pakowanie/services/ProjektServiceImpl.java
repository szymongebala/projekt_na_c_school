package com.projekt.pakowanie.pakowanie.services;


import com.projekt.pakowanie.pakowanie.klasy.modele.Projekt;
import com.projekt.pakowanie.pakowanie.repository.ProjektRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjektServiceImpl implements ProjektService {
	private ProjektRepository projektRepository;

	public ProjektServiceImpl(ProjektRepository projektRepository) {
		this.projektRepository = projektRepository;
	}

	@Override
	public Projekt CreateProjekt(String nazwaProjektu) {

		Projekt projekt = new Projekt(nazwaProjektu);
		projektRepository.save(projekt);
		return projekt;
	}

	@Override
	public List<Projekt> showAll() {
		return (List<Projekt>) projektRepository.findAll();
	}

	@Override
	public Optional<Projekt> find(Long id) {
		Optional<Projekt> projekt = projektRepository.findById(id);
		return projekt;
	}

	@Override
	public Iterable<Projekt> findAll() {
		return projektRepository.findAll();

	}


}
