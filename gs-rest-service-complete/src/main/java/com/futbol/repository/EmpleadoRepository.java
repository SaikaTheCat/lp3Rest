package com.futbol.repository;

import com.futbol.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Empleado Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {


}
