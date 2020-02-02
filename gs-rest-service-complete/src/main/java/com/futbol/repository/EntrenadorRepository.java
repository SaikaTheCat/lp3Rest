package com.futbol.repository;

import com.futbol.domain.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Entrenador Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {



}
