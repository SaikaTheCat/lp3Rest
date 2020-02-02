package com.futbol.rest.controller;

import com.futbol.domain.Donaciones;
import com.futbol.service.DonacionesService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/donaciones")
public class DonacionesController {

	@Autowired
	private DonacionesService clubService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Donaciones getById(@PathVariable("id") Integer id) {
        Donaciones donaciones = clubService.findById(id);
        return donaciones;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Donaciones> list() {
        return clubService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Donaciones donaciones) {
    	clubService.save(donaciones);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	clubService.delete(id);
    }

}