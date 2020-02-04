package com.futbol.rest.controller;

import com.futbol.domain.Departamento;
import com.futbol.service.DepartamentoService;
import com.futbol.service.DirectorService;
import com.futbol.rest.dto.DepartamentoDto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *La clase Rest controller de Departamento expone la API REST para su creacion y recuperacion
 * @author
 */
@RestController
@RequestMapping("/departamento")
public class DepartmentoController {

	@Autowired
	private DepartamentoService departamentoService;
        
        @Autowired
        private DirectorService directorService;
                 

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Departamento getById(@PathVariable("id") Integer id) {
        Departamento departamento = departamentoService.findById(id);
        return departamento;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Departamento> list() {
        return departamentoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody DepartamentoDto departamentoDto) {
        Departamento departamento=new Departamento(0, departamentoDto.getNom(), directorService.findById(departamentoDto.getDirectorId()));
    	departamentoService.save(departamento);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	departamentoService.delete(id);
    }

}