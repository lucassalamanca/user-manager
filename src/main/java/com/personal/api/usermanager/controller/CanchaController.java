package com.personal.api.usermanager.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.personal.api.usermanager.model.Cancha;
import com.personal.api.usermanager.repository.CanchaRepository;

@RestController
@RequestMapping("/canchas/")
public class CanchaController {
	
	@Autowired
	private CanchaRepository canchaRepository;
	
	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    public Cancha getCanchaById(@PathVariable long id) {
		Optional<Cancha> cancha = canchaRepository.findById(id);
        return cancha.get();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void deleteCancha(@PathVariable long id) {
    	canchaRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Cancha createCancha(@RequestBody Cancha cancha) {
        return canchaRepository.save(cancha);
    }

}
