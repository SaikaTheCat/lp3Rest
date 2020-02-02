package com.futbol.repository;

import com.futbol.domain.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TorneoRepository extends JpaRepository<Torneo, Integer> {

//	List<Torneo> findByNom(String descipcion);

}
