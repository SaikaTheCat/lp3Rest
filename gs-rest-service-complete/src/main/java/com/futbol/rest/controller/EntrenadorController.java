package com.futbol.rest.controller;

import com.futbol.domain.Club;
import com.futbol.domain.Entrenador;
import com.futbol.service.EntrenadorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Entrenador Rest Cotroller class expose the REST API for creation and retrieving it
 * @author
 */
@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {

	@Autowired
	private EntrenadorService clubService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Entrenador getById(@PathVariable("id") Integer id) {
        Entrenador entrenador = clubService.findById(id);
        return entrenador;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Entrenador> list() {
        return clubService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Entrenador entrenador) {
    	clubService.save(entrenador);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	clubService.delete(id);
    }

}