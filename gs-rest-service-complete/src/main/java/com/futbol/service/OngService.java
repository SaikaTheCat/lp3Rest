package com.futbol.service;

import com.futbol.domain.Ong;
import com.futbol.repository.OngRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  La clase de servicio actua como una capa de servicio que se situa entre el controller y las clases DAO(Data access object)
 *  y de esta manera el trabajo del procesamiento puede ser agregado aqui
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
