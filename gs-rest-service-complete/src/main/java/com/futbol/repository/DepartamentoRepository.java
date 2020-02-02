package com.futbol.repository;

import com.futbol.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Departament Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {


}
