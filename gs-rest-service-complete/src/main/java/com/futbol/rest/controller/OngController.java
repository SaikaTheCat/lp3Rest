package com.futbol.rest.controller;

import com.futbol.domain.Ong;
import com.futbol.service.OngService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ong Rest Cotroller class expose the REST API for creation and retrieving it
 * @author
 */
@RestController
@RequestMapping("/ong")
public class OngController {

	@Autowired
	private OngService ongService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Ong getById(@PathVariable("id") Integer id) {
        Ong club = ongService.findById(id);
        return club;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Ong> list() {
        return ongService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Ong ong) {
    	ongService.save(ong);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	ongService.delete(id);
    }

}