package com.futbol.repository;

import com.futbol.domain.Donaciones;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Donaciones Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface DonacionesRepository extends JpaRepository<Donaciones, Integer> {


}
