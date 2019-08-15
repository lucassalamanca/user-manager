package com.personal.api.usermanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.personal.api.usermanager.model.Cancha;
import com.personal.api.usermanager.services.CanchaService;

@RestController
@RequestMapping("/canchas/")
public class CanchaController {
	
	@Autowired
	private CanchaService canchaService;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin(origins = {"http://localhost:3000","http://localhost:57949"})
    public List<Cancha> getAllCanchas() {
		List<Cancha> canchas = (List<Cancha>) canchaService.findAll();
        return canchas;
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    public Cancha getCanchaById(@PathVariable long id) {
		Optional<Cancha> cancha = canchaService.findById(id);
        return cancha.get();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void deleteCancha(@PathVariable long id) {
    	canchaService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Cancha createCancha(@RequestBody Cancha cancha) {
        return canchaService.save(cancha);
    }

}
