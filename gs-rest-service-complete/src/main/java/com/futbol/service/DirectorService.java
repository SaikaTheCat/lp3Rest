package com.futbol.service;

import com.futbol.domain.Director;
import com.futbol.repository.DirectorRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class act as service layer and sit between the Controller and DAO classes
 *  so processing work can be added here
 * @author
 */
@Service
public class DirectorService {

	@Autowired
	private DirectorRepository directorRepository;

	public Director findById(int id) {
		return  directorRepository.findById(id).get();
		
	}

	public List<Director> findAll() {
		return directorRepository.findAll();
	}

	public void save(Director club) {
		directorRepository.save(club);
	}

	public void delete(int id) {
		directorRepository.deleteById(id);
	}

}
