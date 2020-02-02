package com.futbol.service;

import com.futbol.domain.Ong;
import com.futbol.repository.OngRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class act as service layer and sit between the Controller and DAO classes
 *  so processing work can be added here
 * @author
 */
@Service
public class OngService {

	@Autowired
	private OngRepository OngRepository;

	public Ong findById(int id) {
		return  OngRepository.findById(id).get();
		
	}

	public List<Ong> findAll() {
		return OngRepository.findAll();
	}

	public void save(Ong club) {
		OngRepository.save(club);
	}

	public void delete(int id) {
		OngRepository.deleteById(id);
	}

}
