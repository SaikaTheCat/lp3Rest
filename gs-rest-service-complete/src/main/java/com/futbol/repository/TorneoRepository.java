package com.futbol.repository;

import com.futbol.domain.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Torneo Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface TorneoRepository extends JpaRepository<Torneo, Integer> {

//	List<Torneo> findByNom(String descipcion);

}
