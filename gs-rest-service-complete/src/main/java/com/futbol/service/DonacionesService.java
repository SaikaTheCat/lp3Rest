package com.futbol.service;

import com.futbol.domain.Donaciones;
import com.futbol.repository.DonacionesRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class act as service layer and sit between the Controller and DAO classes
 *  so processing work can be added here
 * @author
 */
@Service
public class DonacionesService {

	@Autowired
	private DonacionesRepository donacionesRepository;

	public Donaciones findById(int id) {
		return  donacionesRepository.findById(id).get();
		
	}

	public List<Donaciones> findAll() {
		return donacionesRepository.findAll();
	}

	public void save(Donaciones club) {
		donacionesRepository.save(club);
	}

	public void delete(int id) {
		donacionesRepository.deleteById(id);
	}

}
