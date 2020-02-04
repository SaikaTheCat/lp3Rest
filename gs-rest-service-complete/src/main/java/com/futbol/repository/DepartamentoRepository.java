package com.futbol.repository;

import com.futbol.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * La clase de DepartamentoRepository provee el acceso del CRUD (Create, Read, Update and Delete) para la clase del domain
 * heredado de la clase de Spring JpaRepository
 * @author
 */
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {


}
