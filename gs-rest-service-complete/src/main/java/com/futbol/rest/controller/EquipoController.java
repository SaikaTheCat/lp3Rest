package com.futbol.rest.controller;

import com.futbol.domain.Equipo;
import com.futbol.service.EquipoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Equipo Rest Cotroller class expose the REST API for creation and retrieving it
 * @author
 */
@RestController
@RequestMapping("/equipo")
public class EquipoController {

	@Autowired
	private EquipoService equipoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Equipo getById(@PathVariable("id") Integer id) {
        Equipo equipo = equipoService.findById(id);
        return equipo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Equipo> list() {
        return equipoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Equipo equipo) {
    	equipoService.save(equipo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	equipoService.delete(id);
    }

}