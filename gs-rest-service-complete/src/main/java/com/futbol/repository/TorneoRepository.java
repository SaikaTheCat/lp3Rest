package com.futbol.repository;

import com.futbol.domain.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * La clase de TorneoRepository provee el acceso del CRUD (Create, Read, Update and Delete) para la clase del domain
 * heredado de la clase de Spring JpaRepository
 * @author
 */
public interface TorneoRepository extends JpaRepository<Torneo, Integer> {

//	List<Torneo> findByNom(String descipcion);

}
