package com.inti.formation.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.metier.IJoueurMetier;
import com.inti.formation.models.Joueur;
import com.inti.formation.repositories.IJoueursRepository;

@Service
public class JoueurMetier implements IJoueurMetier {
	@Autowired
	private IJoueursRepository repo;
	
	
	@Override
	public Joueur saveOrUpdate(Joueur j) {
 
		return repo.save(j);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public Joueur getById(int id) {
 		return repo.findById(id).get();
	}

	@Override
	public List<Joueur> getAll() {
		 
		return repo.findAll();
	}
}
