package com.futbol.service;

import com.futbol.domain.Torneo;
import com.futbol.repository.TorneoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class act as service layer and sit between the Controller and DAO classes
 *  so processing work can be added here
 * @author
 */
@Service
public class TorneoService {

	@Autowired
	private TorneoRepository torneoRepository;

	public Torneo findById(int id) {
		return  torneoRepository.findById(id).get();
		
	}

	public List<Torneo> findAll() {
		return torneoRepository.findAll();
	}

	public void save(Torneo club) {
		torneoRepository.save(club);
	}

	public void delete(int id) {
		torneoRepository.deleteById(id);
	}

}
