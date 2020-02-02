package com.futbol.repository;

import com.futbol.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Equipo Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {


}
