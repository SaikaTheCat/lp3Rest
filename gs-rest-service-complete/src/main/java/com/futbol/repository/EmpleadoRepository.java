package com.futbol.repository;

import com.futbol.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {


}
