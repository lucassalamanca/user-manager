package com.personal.api.usermanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.api.usermanager.model.Cancha;
import com.personal.api.usermanager.repository.CanchaRepository;

@Service
public class CanchaService {
	
	@Autowired
	private CanchaRepository canchaRepository;
	
	public List<Cancha> findAll(){
		return (List<Cancha>)canchaRepository.findAll();
	}

	public Optional<Cancha> findById(long id) {
		// TODO Auto-generated method stub
		return canchaRepository.findById(id);
	}

	public void deleteById(long id) {
		canchaRepository.deleteById(id);
	}

	public Cancha save(Cancha cancha) {
		return canchaRepository.save(cancha);
	}

}
