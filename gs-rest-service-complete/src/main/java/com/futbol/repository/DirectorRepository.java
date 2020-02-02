package com.futbol.repository;

import com.futbol.domain.Director;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Director Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface DirectorRepository extends JpaRepository<Director, Integer> {


}
