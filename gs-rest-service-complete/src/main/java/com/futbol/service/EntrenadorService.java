package com.futbol.service;

import com.futbol.domain.Entrenador;
import com.futbol.repository.EntrenadorRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EntrenadorService {

	@Autowired
	private EntrenadorRepository entrenadorRepository;

	public Entrenador findById(int id) {
		return  entrenadorRepository.findById(id).get();
		
	}

	public List<Entrenador> findAll() {
		return entrenadorRepository.findAll();
	}

	public void save(Entrenador club) {
		entrenadorRepository.save(club);
	}

	public void delete(int id) {
		entrenadorRepository.deleteById(id);
	}

}
