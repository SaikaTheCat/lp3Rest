package com.futbol.service;

import com.futbol.domain.Empleado;
import com.futbol.repository.EmpleadoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Service class act as service layer and sit between the Controller and DAO classes
 *  so processing work can be added here
 * @author
 */
@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public Empleado findById(int id) {
		return  empleadoRepository.findById(id).get();
		
	}

	public List<Empleado> findAll() {
		return empleadoRepository.findAll();
	}

	public void save(Empleado empleado) {
		empleadoRepository.save(empleado);
	}

	public void delete(int id) {
		empleadoRepository.deleteById(id);
	}

}
