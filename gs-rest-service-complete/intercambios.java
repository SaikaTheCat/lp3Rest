package com.futbol.service;

import com.futbol.domain.Empleado;
import com.futbol.repository.EmpleadoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  La clase de servicio actua como una capa de servicio que se situa entre el controller y las clases DAO(Data access object)
 *  y de esta manera el trabajo del procesamiento puede ser agregado aqui
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
