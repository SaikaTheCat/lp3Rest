package com.futbol.service;

import com.futbol.domain.Departamento;
import com.futbol.repository.DepartamentoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class act as service layer and sit between the Controller and DAO classes
 *  so processing work can be added here
 * @author
 */
@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public Departamento findById(int id) {
		return  departamentoRepository.findById(id).get();
		
	}

	public List<Departamento> findAll() {
		return departamentoRepository.findAll();
	}

	public void save(Departamento club) {
		departamentoRepository.save(club);
	}

	public void delete(int id) {
		departamentoRepository.deleteById(id);
	}

}
