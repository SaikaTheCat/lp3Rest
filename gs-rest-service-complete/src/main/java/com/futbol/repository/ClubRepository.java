package com.futbol.repository;

import com.futbol.domain.Club;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Club Repository class provide the CRUD access for domain classes
 * inherited from Spring JpaRepository class
 * @author
 */
public interface ClubRepository extends JpaRepository<Club, Integer> {


}
