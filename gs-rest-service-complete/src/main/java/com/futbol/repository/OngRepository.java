package com.futbol.repository;

import com.futbol.domain.Ong;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Ong Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface OngRepository extends JpaRepository<Ong, Integer> {

}
