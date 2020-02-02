package com.futbol.rest.controller;

import com.futbol.domain.Torneo;
import com.futbol.service.TorneoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Torneo Rest Cotroller class expose the REST API for creation and retrieving it
 * @author
 */
@RestController
@RequestMapping("/torneo")
public class TorneoController {

	@Autowired
	private TorneoService torneoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Torneo getById(@PathVariable("id") Integer id) {
        Torneo torneo = torneoService.findById(id);
        return torneo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Torneo> list() {
        return torneoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Torneo torneo) {
    	torneoService.save(torneo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	torneoService.delete(id);
    }

}