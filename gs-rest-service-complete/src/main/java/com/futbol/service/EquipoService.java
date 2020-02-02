package com.futbol.service;

import com.futbol.domain.Equipo;
import com.futbol.repository.EquipoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EquipoService {

	@Autowired
	private EquipoRepository equipoRepository;

	public Equipo findById(int id) {
		return  equipoRepository.findById(id).get();
		
	}

	public List<Equipo> findAll() {
		return equipoRepository.findAll();
	}

	public void save(Equipo club) {
		equipoRepository.save(club);
	}

	public void delete(int id) {
		equipoRepository.deleteById(id);
	}

}