package com.futbol.repository;

import com.futbol.domain.Donaciones;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * La clase de DonacionesRepository provee el acceso del CRUD (Create, Read, Update and Delete) para la clase del domain
 * heredado de la clase de Spring JpaRepository
 * @author
 */
public interface DonacionesRepository extends JpaRepository<Donaciones, Integer> {


}
