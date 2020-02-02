package com.futbol.rest.controller;

import com.futbol.domain.Club;
import com.futbol.service.ClubService;
import com.futbol.service.EmpleadoService;
import com.futbol.service.EquipoService;
import com.futbol.rest.dto.ClubDto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Club Rest Cotroller class expose the REST API for Club creation and retrieving it
 * @author
 */
@RestController
@RequestMapping("/club")
public class ClubController {

	@Autowired
	private ClubService clubService;
        
        @Autowired
        private EmpleadoService empleadoService;
        
        @Autowired
        private EquipoService equipoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Club getById(@PathVariable("id") Integer id) {
        Club club = clubService.findById(id);
        return club;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Club> list() {
        return clubService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody ClubDto clubDto) {
        Club club=new Club();
        club.setEmpleado(empleadoService.findById(clubDto.getEmployeeId()));
        club.setEquipo(equipoService.findById(clubDto.getEquipmentId()));
    	clubService.save(club);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	clubService.delete(id);
    }

}