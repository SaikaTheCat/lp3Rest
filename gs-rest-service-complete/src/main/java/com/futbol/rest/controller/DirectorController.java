package com.futbol.rest.controller;

import com.futbol.domain.Director;
import com.futbol.service.DirectorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Director Rest Cotroller class expose the REST API for creation and retrieving it
 * @author
 */
@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	private DirectorService directorService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Director getById(@PathVariable("id") Integer id) {
        Director director = directorService.findById(id);
        return director;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Director> list() {
        return directorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Director director) {
    	directorService.save(director);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
    	directorService.delete(id);
    }

}