package com.futbol.rest.controller;

import com.futbol.domain.Empleado;
import com.futbol.service.EmpleadoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * La clase Rest controller de Empleado expone la API REST para su creacion y recuperacion
 * @author
 */
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService equipoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Empleado getById(@PathVariable("id") Integer id) {
        Empleado empleado = equipoService.findById(id);
        return empleado;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Empleado> list() {
        return equipoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Empleado empleado) {
    	equipoService.save(empleado);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	equipoService.delete(id);
    }

}