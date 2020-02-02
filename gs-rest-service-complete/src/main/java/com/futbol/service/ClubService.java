package com.futbol.service;

import com.futbol.domain.Club;
import com.futbol.repository.ClubRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClubService {

	@Autowired
	private ClubRepository clubRepository;

	public Club findById(int id) {
		return  clubRepository.findById(id).get();
		
	}

	public List<Club> findAll() {
		return clubRepository.findAll();
	}

	public void save(Club club) {
		clubRepository.save(club);
	}

	public void delete(int id) {
		clubRepository.deleteById(id);
	}

}